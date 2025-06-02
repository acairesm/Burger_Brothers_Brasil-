package Controller;

class PedidoController {
    private List<Pedido> pedidos = new ArrayList<>();

    public void registrarPedido(Pedido pedido) {
        pedidos.add(pedido);
        System.out.println("Pedido registrado com sucesso!");
    }
}
