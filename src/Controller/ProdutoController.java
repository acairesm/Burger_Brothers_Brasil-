package Controller;

class ProdutoController {
    private List<Produto> produtos = new ArrayList<>();

    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }
    public List<Produto> listarProdutos() { return produtos; }
}
