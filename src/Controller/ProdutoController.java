package controller;

import model.Produto;
import java.util.ArrayList;
import java.util.List;

public class ProdutoController {
    private List<Produto> produtos;

    public ProdutoController() {
        this.produtos = new ArrayList<>();
    }

    public void cadastrarProduto(Produto produto) {
        produtos.add(produto);
    }

    public List<Produto> listarProdutos() {
        return produtos;
    }

    public void editarProduto(Produto produto) {
        // Implementar lógica para editar produto
    }

    public void deletarProduto(Produto produto) {
        produtos.remove(produto);
    }
}

