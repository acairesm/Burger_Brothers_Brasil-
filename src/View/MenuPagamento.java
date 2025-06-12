package View;

import Controller.PagamentoController;
import Controller.PedidoController;
import Model.*;

import java.util.List;

public class MenuPagamento {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    private static final String ANSI_YELLOW = "\u001B[33m";

    public static void exibir() {
        int opcao;
        do {
            System.out.println(ANSI_BLUE + "==========================" + ANSI_RESET);
            System.out.println(ANSI_BLUE + "       MENU PAGAMENTO" + ANSI_RESET);
            System.out.println(ANSI_BLUE + "==========================" + ANSI_RESET);
            System.out.println(ANSI_GREEN + "💳 [1] Processar Pagamento" + ANSI_RESET);
            System.out.println(ANSI_PURPLE + "📜 [2] Histórico de Pagamentos" + ANSI_RESET);
            System.out.println(ANSI_RED + "🔄 [3] Reembolsar Pagamento" + ANSI_RESET);
            System.out.println(ANSI_CYAN+ "🔙 [0] Voltar ao Menu Principal" + ANSI_RESET);
            System.out.println(ANSI_BLUE + "==========================" + ANSI_RESET);
            opcao = InputHelper.lerInt("Digite uma opção: ");

            switch (opcao) {
                case 1 -> processarPagamento();
                case 2 -> listarPagamentos();
                case 3 -> reembolsarPagamento();
                case 0 -> System.out.println(ANSI_BLUE + "Voltando ao menu principal..." + ANSI_RESET);
                default -> System.out.println(ANSI_RED + "Opção inválida!" + ANSI_RESET);
            }
        } while (opcao != 0);
    }

    private static void processarPagamento() {
        System.out.println(ANSI_BLUE + "--------- Lista de pedidos a pagar---------" + ANSI_RESET);
        List<Pedido> pedidos = PedidoController.listarPedidos();
        if (pedidos.isEmpty()) {
            System.out.println(ANSI_YELLOW + "Nenhum pedido cadastrado." + ANSI_RESET);
            return;
        }
        for (int i = 0; i < pedidos.size(); i++) {
            Pedido pedido = pedidos.get(i);
            System.out.println(ANSI_GREEN + "Pedido #" + (i + 1) + ANSI_RESET);
            System.out.println("Cliente: " + pedido.getCliente().getNome());
            System.out.println("Valor Total: R$" + String.format("%.2f", pedido.calcularValorTotal()));
            System.out.println(ANSI_BLUE + "---------------------------------" + ANSI_RESET);
        }
        float valor = InputHelper.lerFloat("Digite o valor do pagamento: ");
        String metodo = InputHelper.lerString("Digite o método de pagamento (Cartão, Dinheiro): ");
        Pagamento pagamento;
        if (metodo.equalsIgnoreCase("Cartão")) {
            pagamento = new PagamentoCartao(valor);
        } else if (metodo.equalsIgnoreCase("Dinheiro")) {
            pagamento = new PagamentoDinheiro(valor);
        } else {
            System.out.println(ANSI_RED + "Método de pagamento inválido!" + ANSI_RESET);
            return;
        }
        PagamentoController.processarPagamento(pagamento);
    }

    private static void listarPagamentos() {
        List<Pagamento> pagamentos = PagamentoController.listarPagamentos();
        if (pagamentos.isEmpty()) {
            System.out.println(ANSI_RED + "Nenhum pagamento registrado." + ANSI_RESET);
            return;
        }
        System.out.println(ANSI_BLUE + "--------- Histórico de Pagamentos ---------" + ANSI_RESET);
        for (int i = 0; i < pagamentos.size(); i++) {
            System.out.println((i + 1) + ". " + pagamentos.get(i));
        }
    }

    private static void reembolsarPagamento() {
        listarPagamentos();
        List<Pagamento> pagamentos = PagamentoController.listarPagamentos();
        if (!pagamentos.isEmpty()){
            int indice = InputHelper.lerInt("Escolha o número do pagamento que deseja reembolsar: ") - 1;
            PagamentoController.reembolsarPagamento(indice);
        }
    }
}
