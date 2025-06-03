package Controller;

import Model.Pedido;
import java.util.ArrayList;
import java.util.List;

public class PedidoController {
    private static List<Pedido> pedidos = new ArrayList<>();



    public static void criarPedido(Pedido pedido) {
        pedidos.add(pedido);
    }

    public static List<Pedido> listarPedidos() {
        return pedidos;
    }

    public void finalizarPedido(Pedido pedido) {
        // Implementar lógica para finalizar pedido
    }
}

