package model;

import java.util.ArrayList;
import java.util.List;

public class Combo extends Produto {
    private List<Produto> produtos;

    public Combo(String nome, double preco) {
        super(nome, preco);
        this.produtos = new ArrayList<>();
    }

    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }

    @Override
    public double getPreco() {
        double precoTotal = 0;
        for (Produto p : produtos) {
            precoTotal += p.getPreco();
        }
        return precoTotal; // Pode aplicar desconto se necessário
    }

    @Override
    public String toString() {
        return super.toString() + ", Produtos: " + produtos;
    }
}
