package model;

import java.util.ArrayList;
import java.util.List;

public class Cliente extends Pessoa {
    private List<Pedido> historicoPedidos;

    public Cliente(String nome, String telefone, Endereco endereco) {
        super(nome, telefone, endereco);
        this.historicoPedidos = new ArrayList<>();
    }

    public void adicionarPedido(Pedido pedido) {
        historicoPedidos.add(pedido);
    }

    public List<Pedido> getHistoricoPedidos() {
        return historicoPedidos;
    }

    @Override
    public String toString() {
        return super.toString() + ", Histórico de Pedidos: " + historicoPedidos.size();
    }
}


