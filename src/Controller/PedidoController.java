package controller;

import model.Pedido;
import java.util.ArrayList;
import java.util.List;

public class PedidoController {
    private List<Pedido> pedidos;

    public PedidoController() {
        this.pedidos = new ArrayList<>();
    }

    public void criarPedido(Pedido pedido) {
        pedidos.add(pedido);
    }

    public List<Pedido> listarPedidos() {
        return pedidos;
    }

    public void finalizarPedido(Pedido pedido) {
        // Implementar lógica para finalizar pedido
    }
}

