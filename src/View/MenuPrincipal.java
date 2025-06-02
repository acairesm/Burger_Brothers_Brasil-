
package view;

import java.util.Scanner;
import controller.ClienteController;
import controller.ProdutoController;
import controller.PedidoController;

public class MenuPrincipal {
    private Scanner scanner;
    private ClienteController clienteController;
    private ProdutoController produtoController;
    private PedidoController pedidoController;

    public MenuPrincipal() {
        this.scanner = new Scanner(System.in);
        this.clienteController = new ClienteController();
        this.produtoController = new ProdutoController();
        this.pedidoController = new PedidoController();
    }

    public void exibir() {
        int opcao;
        do {
            System.out.println("Menu Principal:");
            System.out.println("1. Gerenciar Clientes");
            System.out.println("2. Gerenciar Produtos");
            System.out.println("3. Gerenciar Pedidos");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    // Chamar MenuCliente
                    break;
                case 2:
                    // Chamar MenuProduto
                    break;
                case 3:
                    // Chamar MenuPedido
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 0);
    }
}
