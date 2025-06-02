package View;

import java.util.Scanner;

public class MenuPrincipal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ClienteController clienteController = new ClienteController();
        ProdutoController produtoController = new ProdutoController();
        PedidoController pedidoController = new PedidoController();
        PagamentoController pagamentoController = new PagamentoController();

        while (true) {
            System.out.println("\n=== Hamburgueria ===");
            System.out.println("1. Cadastrar Cliente");
            System.out.println("2. Adicionar Produto");
            System.out.println("3. Realizar Pedido");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    MenuCliente.executar(scanner, clienteController);
                    break;
                case 2:
                    MenuProduto.executar(scanner, produtoController);
                    break;
                case 3:
                    MenuPedido.executar(scanner, clienteController, produtoController, pedidoController, pagamentoController);
                    break;
                case 0:
                    System.out.println("Saindo...");
                    return;
                default:
                    System.out.println("Opção inválida!");
            }
        }
    }
}
