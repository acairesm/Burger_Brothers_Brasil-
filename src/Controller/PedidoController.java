package Controller;

import Model.Pedido;
import java.util.ArrayList;
import java.util.List;

public class PedidoController {
    private static List<Pedido> pedidos = new ArrayList<>();
    // ANSI codes for console colors (if you want to use them here)
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_RESET = "\u001B[0m";


    public static void criarPedido(Pedido pedido) {
        pedidos.add(pedido);
        System.out.println(ANSI_GREEN + "Pedido criado com sucesso! " + ANSI_RESET); //
    }

    public static List<Pedido> listarPedidos() {
        return pedidos; //
    }

    // Modified removePedido to take an index
    public static void removerPedido(int indice) {
        if (indice >= 0 && indice < pedidos.size()) {
            Pedido pedidoRemovido = pedidos.get(indice); // Get reference for message
            pedidos.remove(indice);
            // Assuming Pedido has getCliente() and Cliente has getNome(), and Pedido has getData()
            System.out.println(ANSI_GREEN + "Pedido de " + pedidoRemovido.getCliente().getNome() +
                               " realizado em " + pedidoRemovido.getData() + " removido com sucesso!" + ANSI_RESET);
        } else {
            System.out.println(ANSI_RED + "Índice de pedido inválido!" + ANSI_RESET);
        }
    }

    // Placeholder for potential future use if direct object modification isn't preferred for updates.
    // For now, alterations in MenuPedido will modify the Pedido object directly from the list.
    // public static void atualizarPedido(int indice, Pedido pedidoAtualizado) {
    //     if (indice >= 0 && indice < pedidos.size()) {
    //         pedidos.set(indice, pedidoAtualizado);
    //         System.out.println(ANSI_GREEN + "Pedido atualizado com sucesso!" + ANSI_RESET);
    //     } else {
    //         System.out.println(ANSI_RED + "Índice de pedido inválido para atualização!" + ANSI_RESET);
    //     }
    // }
}