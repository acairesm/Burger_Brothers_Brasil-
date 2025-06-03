package View;

import Controller.ProdutoController;
import Model.Produto;

public class MenuProduto {

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_RED = "\u001B[31m";


    public static void exibir() {
        int opcao;
        do {
            System.out.println(ANSI_BLUE + "Menu de Produtos:" + ANSI_RESET);
            System.out.println(ANSI_GREEN + "1. Cadastrar Produto" + ANSI_RESET);
            System.out.println(ANSI_GREEN +"2. Listar Produtos" + ANSI_RESET);
            System.out.println(ANSI_RED + "0. Voltar"+ ANSI_RESET);
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
        System.out.println(ANSI_BLUE + "--------- Lista de Produtos ---------" + ANSI_RESET);
        System.out.println(ANSI_GREEN+ "1. Hamburguer" + ANSI_RESET);
        System.out.println(ANSI_GREEN+ "2. Bebida" + ANSI_RESET);
        System.out.println(ANSI_GREEN+ "3. Acompanhamento" + ANSI_RESET);
        int tipo = InputHelper.lerInt("Escolha o tipo de produto: ");
        String nome = InputHelper.lerString("Nome: ");
        float preco = InputHelper.lerFloat("Preço: ");

        switch (tipo) {
            case 1 -> {
                String tipoCarne = InputHelper.lerString("Tipo de Carne: ");
                boolean temQueijo = InputHelper.lerBoolean("Tem queijo? ");
                ProdutoController.cadastrarHamburguer(nome, preco, tipoCarne, temQueijo);
            }
            case 2 -> {
                boolean isAlcoolica = InputHelper.lerBoolean("É alcoolica?  ");
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
