package View;

import controller.PedidoController;
import model.Pedido;
import model.Cliente;
import model.Funcionario;
import model.ItemPedido;
import model.Produto;

public class MenuPedido {

    private PedidoController pedidoController;

    public MenuPedido(PedidoController pedidoController) {
        this.pedidoController = pedidoController;
    }

    public void exibir() {
        int opcao=0;
        do {
            System.out.println("Menu de Pedidos:");
            System.out.println("1. Criar Pedido");
            System.out.println("2. Listar Pedidos");
            System.out.println("0. Voltar");
            opcao = InputHelper.lerInt("Escolha uma opção:  ");

            switch (opcao) {
                case 1 -> criarPedido();
                case 2 -> listarPedidos();
                case 0 -> System.out.println("Voltando ao menu principal...");
                default -> System.out.println("Opção inválida!");
            }
        } while (opcao != 0);
    }

    private void criarPedido() {
        // Implementar lógica para criar pedido
        // Exemplo simplificado
        System.out.println("Criando pedido...");
        // Aqui você pode adicionar lógica para selecionar cliente, funcionario e produtos
    }

    private void listarPedidos() {
        System.out.println("Lista de Pedidos:");
        for (Pedido pedido : pedidoController.listarPedidos()) {
            System.out.println(pedido);
        }
    }
}


