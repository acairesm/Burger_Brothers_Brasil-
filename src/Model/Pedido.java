package Model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Pedido {
    private Cliente cliente;
    private List<ItemPedido> itens;
    private Date data;

    // Constructor as provided
    public Pedido(Cliente cliente, List<ItemPedido> itens) { //
        this.cliente = cliente;
        this.itens = (itens != null) ? new ArrayList<>(itens) : new ArrayList<>(); // Initialize with provided items or new list
        this.data = new Date(); // Data atual //
    }

    public void adicionarItem(ItemPedido item) {
        this.itens.add(item); //
    }

    public double calcularValorTotal() {
        double total = 0;
        for (ItemPedido item : itens) {
            total += item.calcularSubtotal(); //
        }
        return total;
    }

    // Getter for cliente
    public Cliente getCliente() {
        return cliente;
    }

    // Getter for itens
    public List<ItemPedido> getItens() {
        return itens;
    }

    // Getter for data
    public Date getData() {
        return data;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Pedido { Cliente: ").append(cliente.getNome()); // Assuming Cliente has getNome()
        sb.append(", Data: ").append(data);
        sb.append(", Itens: [\n");
        if (itens.isEmpty()) {
            sb.append("  Nenhum item no pedido.\n");
        } else {
            for (ItemPedido item : itens) {
                sb.append("    ").append(item).append("\n"); //
            }
        }
        sb.append("  ], Valor Total: R$ ").append(String.format("%.2f", calcularValorTotal()));
        sb.append("\n}");
        return sb.toString();
    }
}