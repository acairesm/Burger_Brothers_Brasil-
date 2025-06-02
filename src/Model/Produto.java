package model;
public abstract class Produto implements ItemCardapio {
    protected String nome;
    protected double preco;
    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }
    @Override
    public String getNome() {
        return nome;
    }
    @Override
    public double getPreco() {
        return preco;
    }
    @Override
    public String toString() {
        return "Produto: " + nome + ", Preço: " + preco;
    }
}