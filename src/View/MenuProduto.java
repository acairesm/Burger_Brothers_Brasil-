package View;

import controller.ProdutoController;
import model.Produto;
import model.Hamburguer;
import model.Bebida;
import model.Acompanhamento;

public class MenuProduto {
    private ProdutoController produtoController;

    public MenuProduto(ProdutoController produtoController) {
        this.produtoController = produtoController;
    }

    public void exibir() {
        int opcao;
        do {
            System.out.println("Menu de Produtos:");
            System.out.println("1. Cadastrar Produto");
            System.out.println("2. Listar Produtos");
            System.out.println("0. Voltar");
            opcao = InputHelper.lerInt("Escolha uma opção ");

            switch (opcao) {
                case 1 -> cadastrarProduto();
                case 2 -> listarProdutos();
                case 0 -> System.out.println("Voltando ao menu principal...");
                default -> System.out.println("Opção inválida!");
            }
        } while (opcao != 0);
    }

    private void cadastrarProduto() {
        System.out.println("1. Hamburguer");
        System.out.println("2. Bebida");
        System.out.println("3. Acompanhamento");
        int tipo = InputHelper.lerInt("Escolha o tipo de produto: ");
        String nome =  InputHelper.lerString("Nome: ");
        double preco = InputHelper.lerDouble("Preço: ");

        Produto produto = null;
        switch (tipo) {
            case 1:
                produto = new Hamburguer(nome, preco);
                break;
            case 2:
                produto = new Bebida(nome, preco);
                break;
            case 3:
                produto = new Acompanhamento(nome, preco);
                break;
            default:
                System.out.println("Tipo de produto inválido!");
                return;
        }

        produtoController.cadastrarProduto(produto);
        System.out.println("Produto cadastrado com sucesso!");
    }

    private void listarProdutos() {
        System.out.println("Lista de Produtos:");
        for (Produto produto : produtoController.listarProdutos()) {
            System.out.println(produto);
        }
    }
}

