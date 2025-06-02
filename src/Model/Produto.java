package Model;

class Produto implements ItemCardapio {
    protected String nome;
    protected double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getDescricao() { return nome; }
    public double getPreco() { return preco; }
}
