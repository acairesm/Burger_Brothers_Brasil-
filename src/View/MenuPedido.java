package View;

import Controller.ClienteController;
import Controller.PedidoController;
import Controller.ProdutoController;
import Model.Pedido;
import Model.Cliente;
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

    }

    private static void listarPedidos() {
        System.out.println(ANSI_BLUE + "--------- Lista de Pedidos ---------" + ANSI_RESET);
        for (Pedido pedido : PedidoController.listarPedidos()) {
            System.out.println(pedido);
        }
    }
}



