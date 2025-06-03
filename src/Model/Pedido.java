package Model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Pedido {
    private Cliente cliente;
    private Funcionario funcionario;
    private List<ItemPedido> itens;
    private Date data;

    public Pedido(Cliente cliente, List<ItemPedido> itens) {
        this.cliente = cliente;
        this.funcionario = funcionario;
        this.itens = new ArrayList<>();
        this.data = new Date(); // Data atual
    }

    public void adicionarItem(ItemPedido item) {
        itens.add(item);
    }

    public double calcularValorTotal() {
        double total = 0;
        for (ItemPedido item : itens) {
            total += item.calcularSubtotal();
        }
        return total;
    }

    @Override
    public String toString() {
        return "Pedido de " + cliente.getNome() + " atendido por " + funcionario.getNome() + ", Total: " + calcularValorTotal();
    }
}

