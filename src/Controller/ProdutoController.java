package Controller;

import Model.Produto;
import java.util.ArrayList;
import java.util.List;

public class ProdutoController {
    private static List<Produto> produtos = new ArrayList<>();

    public static void cadastrarProduto(Produto produto) {
        produtos.add(produto);
    }

    public static List<Produto> listarProdutos() {
        return produtos;
    }

    public void editarProduto(Produto produto) {
        // Implementar lógica para editar produto
    }

    public void deletarProduto(Produto produto) {
        produtos.remove(produto);
    }
}

