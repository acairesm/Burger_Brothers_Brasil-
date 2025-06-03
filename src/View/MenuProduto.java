package View;

import Controller.ProdutoController;
import Model.Produto;

public class MenuProduto {

    public static void exibir() {
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

    private static void cadastrarProduto() {
        System.out.println("1. Hamburguer");
        System.out.println("2. Bebida");
        System.out.println("3. Acompanhamento");
        int tipo = InputHelper.lerInt("Escolha o tipo de produto: ");
        String nome = InputHelper.lerString("Nome: ");
        float preco = InputHelper.lerFloat("Preço: ");

        switch (tipo) {
            case 1 -> {
                String tipoCarne = InputHelper.lerString("Tipo de Carne: ");
                boolean temQueijo = InputHelper.lerBoolean("Tem queijo? (true/false): ");
                ProdutoController.cadastrarHamburguer(nome, preco, tipoCarne, temQueijo);
            }
            case 2 -> {
                boolean isAlcoolica = InputHelper.lerBoolean("É alcoolica? (true/false): ");
                ProdutoController.cadastrarBebida(nome, preco, isAlcoolica);
            }
            case 3 -> {
                String tipoAcompanhamento = InputHelper.lerString("Tipo de Acompanhamento: ");
                ProdutoController.cadastrarAcompanhamento(nome, preco, tipoAcompanhamento);
            }
            default -> System.out.println("Tipo de produto inválido!");
        }

        System.out.println("Produto cadastrado com sucesso!");
    }

    private static void listarProdutos() {
        System.out.println("Lista de Produtos:");
        for (Produto produto : ProdutoController.listarProdutos()) {
            System.out.println(produto);
        }
    }
}
