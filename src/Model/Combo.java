package Model;

class Combo extends Produto {
    private List<Produto> itens;

    public Combo(String nome, double preco) {
        super(nome, preco);
        this.itens = new ArrayList<>();
    }

    public void adicionarProduto(Produto p) {
        itens.add(p);
    }

    public List<Produto> getItens() { return itens; }
}
