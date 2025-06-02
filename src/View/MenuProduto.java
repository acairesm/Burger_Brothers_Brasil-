package view;

import java.util.Scanner;
import controller.ProdutoController;
import model.Produto;
import model.Hamburguer;
import model.Bebida;
import model.Acompanhamento;

public class MenuProduto {
    private Scanner scanner;
    private ProdutoController produtoController;

    public MenuProduto(ProdutoController produtoController) {
        this.scanner = new Scanner(System.in);
        this.produtoController = produtoController;
    }

    public void exibir() {
        int opcao;
        do {
            System.out.println("Menu de Produtos:");
            System.out.println("1. Cadastrar Produto");
            System.out.println("2. Listar Produtos");
            System.out.println("0. Voltar");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    cadastrarProduto();
                    break;
                case 2:
                    listarProdutos();
                    break;
                case 0:
                    System.out.println("Voltando ao menu principal...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 0);
    }

    private void cadastrarProduto() {
        System.out.println("Escolha o tipo de produto:");
        System.out.println("1. Hamburguer");
        System.out.println("2. Bebida");
        System.out.println("3. Acompanhamento");
        int tipo = scanner.nextInt();
        System.out.print("Nome: ");
        String nome = scanner.next();
        System.out.print("Preço: ");
        double preco = scanner.nextDouble();

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

