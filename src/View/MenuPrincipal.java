
package View;


public class MenuPrincipal {

    public void exibir() {
        int opcao;
        do {
            System.out.println("Menu Principal:");
            System.out.println("1. Gerenciar Clientes");
            System.out.println("2. Gerenciar Produtos");
            System.out.println("3. Gerenciar Pedidos");
            System.out.println("0. Sair");
            opcao = InputHelper.lerInt("Digite uma opçao :");

            switch (opcao) {
                case 1:
                    MenuCliente.exibir();
                    break;
                case 2:
                    MenuProduto.exibir();
                    break;
                case 3:
                    MenuPedido.exibir();
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
