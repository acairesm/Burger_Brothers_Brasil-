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
    public static final String ANSI_YELLOW = "\u001B[33m";

    public static void exibir() {
        int opcao;
        do {
            System.out.println(ANSI_BLUE + "========== MENU PAGAMENTO ==========" + ANSI_RESET);
            System.out.println(ANSI_GREEN + "1. Processar Pagamento" + ANSI_RESET);
            System.out.println(ANSI_PURPLE + "2. Histórico de Pagamentos" + ANSI_RESET);
            System.out.println(ANSI_RED + "3. Reembolsar Pagamento" + ANSI_RESET);
            System.out.println(ANSI_CYAN + "0. Voltar ao Menu Principal" + ANSI_RESET);
            System.out.println(ANSI_BLUE + "====================================" + ANSI_RESET);

            opcao = InputHelper.lerInt("Digite uma opção: ");

            switch (opcao) {
                case 1 -> processarPagamento();
                case 2 -> listarPagamentos();
                case 3 -> reembolsarPagamento();
                case 0 -> System.out.println(ANSI_BLUE + "Voltando ao menu principal..." + ANSI_RESET);
                default -> System.out.println(ANSI_RED + "Opção inválida! Tente novamente." + ANSI_RESET);
            }
            System.out.println();
        } while (opcao != 0);
    }

    private static void processarPagamento() {
        System.out.println(ANSI_BLUE + "------ Pedidos disponíveis para pagamento ------" + ANSI_RESET);
        List<Pedido> pedidos = PedidoController.listarPedidos();
        if (pedidos.isEmpty()) {
            System.out.println(ANSI_YELLOW + "Não há pedidos cadastrados no momento." + ANSI_RESET);
            return;
        }

        for (int i = 0; i < pedidos.size(); i++) {
            Pedido p = pedidos.get(i);
            System.out.printf("%d - Cliente: %s | Valor: R$ %.2f%n", i + 1, p.getCliente().getNome(), p.calcularValorTotal());
        }

        int indicePedido = InputHelper.lerInt("Escolha o número do pedido que deseja pagar: ") - 1;
        if (indicePedido < 0 || indicePedido >= pedidos.size()) {
            System.out.println(ANSI_RED + "Número inválido! Tente novamente." + ANSI_RESET);
            return;
        }

        Pedido pedido = pedidos.get(indicePedido);
        float valorPedido = (float) pedido.calcularValorTotal();

        System.out.println(ANSI_BLUE + "------ Escolha o método de pagamento ------" + ANSI_RESET);
        System.out.println(ANSI_GREEN + "C - Cartão" + ANSI_RESET);
        System.out.println(ANSI_GREEN + "D - Dinheiro" + ANSI_RESET);

        char metodo;
        do {
            metodo = InputHelper.lerChar("Digite o método de pagamento (C/D): ");
            if (metodo != 'C' && metodo != 'D' && metodo != 'c' && metodo != 'd') {
                System.out.println(ANSI_RED + "Método inválido! Tente novamente." + ANSI_RESET);
            }
        } while (metodo != 'C' && metodo != 'D' && metodo != 'c' && metodo != 'd');

        float valor;
        do {
            valor = InputHelper.lerFloat("Digite o valor a pagar (R$ " + valorPedido + "): ");
            if (valor != valorPedido) {
                System.out.println(ANSI_RED + "Valor inválido! O valor do pedido é R$ " + valorPedido + "." + ANSI_RESET);
            }
        } while (valor != valorPedido);

        Pagamento pagamento;
        if (metodo == 'C' || metodo == 'c') {
            pagamento = new PagamentoCartao(valor);
        } else { // 'D' or 'd'
            pagamento = new PagamentoDinheiro(valor);
        }

        PagamentoController.processarPagamento(pagamento);
    }

    private static void listarPagamentos() {
        System.out.println(ANSI_BLUE + "------------ Histórico de Pagamentos ------------" + ANSI_RESET);
        List<Pagamento> pagamentos = PagamentoController.listarPagamentos();
        if (pagamentos.isEmpty()) {
            System.out.println(ANSI_RED + "Nenhum pagamento registrado." + ANSI_RESET);
            return;
        }
        for (int i = 0; i < pagamentos.size(); i++) {
            System.out.printf("%d. %s%n", i + 1, pagamentos.get(i));
        }
    }

    private static void reembolsarPagamento() {
        listarPagamentos();
        List<Pagamento> pagamentos = PagamentoController.listarPagamentos();
        if (pagamentos.isEmpty()) {
            System.out.println(ANSI_YELLOW + "Nenhum pagamento para reembolsar." + ANSI_RESET);
            return;
        }

        int indice = -1;
        do {
            indice = InputHelper.lerInt("Escolha o número do pagamento que deseja reembolsar: ") - 1;
            if (indice < 0 || indice >= pagamentos.size()) {
                System.out.println(ANSI_RED + "Número inválido! Tente novamente." + ANSI_RESET);
                indice = -1;
            }
        } while (indice == -1);

        PagamentoController.confirmarReembolso(indice);
    }
}
