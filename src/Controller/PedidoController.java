package Controller;

import Model.Pedido;
import java.util.ArrayList;
import java.util.List;

public class PedidoController {
    private static List<Pedido> pedidos = new ArrayList<>();



    public static void criarPedido(Pedido pedido) {
        pedidos.add(pedido);
        System.out.println("Pedido criado com successo! ");
    }

    public static List<Pedido> listarPedidos() {
        return pedidos;
    }

    public static void removePedido(){

    }
}

