package View;

import Controller.ClienteController;
import Controller.FuncionarioController;
import Controller.PedidoController;
import Controller.ProdutoController;
import Model.Pedido;
import Model.Cliente;
import Model.Funcionario;
import Model.ItemPedido;
import Model.Produto;

import java.util.ArrayList;
import java.util.List;

public class MenuPedido {
    // Cores ANSI
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_RED = "\u001B[31m";

    public static void exibir() {
        int opcao = 0;
        do {
            System.out.println(ANSI_BLUE + "============================" + ANSI_RESET);
            System.out.println(ANSI_BLUE + "       Menu de Pedidos" + ANSI_RESET);
            System.out.println(ANSI_BLUE + "============================" + ANSI_RESET);
            System.out.println(ANSI_GREEN + "1. Criar Pedido" + ANSI_RESET);
            System.out.println(ANSI_GREEN + "2. Listar Pedidos" + ANSI_RESET);
            System.out.println(ANSI_RED + "0. Voltar" + ANSI_RESET);
            System.out.println(ANSI_BLUE + "============================" + ANSI_RESET);
            opcao = InputHelper.lerInt("Escolha uma opção: ");

            switch (opcao) {
                case 1 -> criarPedido();
                case 2 -> listarPedidos();
                case 0 -> System.out.println(ANSI_GREEN + "Voltando ao menu principal..." + ANSI_RESET);
                default -> System.out.println(ANSI_RED + "Opção inválida!" + ANSI_RESET);
            }
        } while (opcao != 0);
    }

    private static void criarPedido() {
        System.out.println(ANSI_BLUE + "--------- Criar Pedido ---------" + ANSI_RESET);

        // Selecionar Cliente
        System.out.println("Selecione um cliente:");
        List<Cliente> clientes = ClienteController.listarClientes();
        for (int i = 0; i < clientes.size(); i++) {
            System.out.println((i + 1) + ". " + clientes.get(i));
        }
        int clienteIndex = InputHelper.lerInt("Escolha o número do cliente: ") - 1;
        Cliente cliente = clientes.get(clienteIndex);

        // Selecionar Funcionário
        System.out.println("Selecione um funcionário:");

        List<Funcionario> funcionarios = FuncionarioController.listarFuncionarios();
        for (int i = 0; i < funcionarios.size(); i++) {
            System.out.println((i + 1) + ". " + funcionarios.get(i));
        }
        int funcionarioIndex = InputHelper.lerInt("Escolha o número do funcionário: ") - 1;
        Funcionario funcionario = funcionarios.get(funcionarioIndex);

        // Selecionar Produtos
        List<ItemPedido> itens = new ArrayList<>();
        boolean adicionarMais = true;
        while (adicionarMais) {
            System.out.println("Selecione um produto:");
            List<Produto> produtos = ProdutoController.listarProdutos();
            for (int i = 0; i < produtos.size(); i++) {
                System.out.println((i + 1) + ". " + produtos.get(i));
            }
            int produtoIndex = InputHelper.lerInt("Escolha o número do produto: ") - 1;
            Produto produto = produtos.get(produtoIndex);
            int quantidade = InputHelper.lerInt("Quantidade: ");
            itens.add(new ItemPedido(produto, quantidade));

            adicionarMais = InputHelper.lerString("Deseja adicionar mais produtos? (s/n): ").equalsIgnoreCase("s");
        }

        // Criar o pedido
        Pedido pedido = new Pedido(cliente, funcionario, itens);
        PedidoController.criarPedido(pedido);
        System.out.println(ANSI_GREEN + "Pedido criado com sucesso!" + ANSI_RESET);
    }

    private static void listarPedidos() {
        System.out.println(ANSI_BLUE + "--------- Lista de Pedidos ---------" + ANSI_RESET);
        for (Pedido pedido : PedidoController.listarPedidos()) {
            System.out.println(pedido);
        }
    }
}



