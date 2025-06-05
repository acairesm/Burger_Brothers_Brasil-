package Controller;

import Model.Produto;
import Model.Hamburguer;
import Model.Bebida;
import Model.Acompanhamento;
import java.util.ArrayList;
import java.util.List;

public class ProdutoController {
    private static List<Produto> produtos = new ArrayList<>();

    public static void cadastrarProduto(Produto produto) {
        produtos.add(produto);
    }

    public static void editarProduto(int indice, Produto produtoAtualizado) {
        if (indice >= 0 && indice < produtos.size()) {
            produtos.set(indice, produtoAtualizado);
        }
    }

    public static List<Produto> listarProdutos() {
        return produtos;
    }

    public static void cadastrarHamburguer(String nome, float preco) {
        Produto hamburguer = new Hamburguer(nome, preco);
        cadastrarProduto(hamburguer);
    }

    public static void cadastrarBebida(String nome, float preco) {
        Produto bebida = new Bebida(nome, preco);
        cadastrarProduto(bebida);
    }

    public static void cadastrarAcompanhamento(String nome, float preco) {
        Produto acompanhamento = new Acompanhamento(nome, preco);
        cadastrarProduto(acompanhamento);
    }


    public static void deletarProduto(Produto produto) {
        produtos.remove(produto);
    }
}
