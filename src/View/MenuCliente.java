package view;

import java.util.Scanner;
import controller.ClienteController;
import model.Cliente;
import model.Endereco;

public class MenuCliente {
    private Scanner scanner;
    private ClienteController clienteController;

    public MenuCliente(ClienteController clienteController) {
        this.scanner = new Scanner(System.in);
        this.clienteController = clienteController;
    }

    public void exibir() {
        int opcao;
        do {
            System.out.println("Menu de Clientes:");
            System.out.println("1. Cadastrar Cliente");
            System.out.println("2. Listar Clientes");
            System.out.println("0. Voltar");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    cadastrarCliente();
                    break;
                case 2:
                    listarClientes();
                    break;
                case 0:
                    System.out.println("Voltando ao menu principal...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 0);
    }

    private void cadastrarCliente() {
        System.out.print("Nome: ");
        String nome = scanner.next();
        System.out.print("Telefone: ");
        String telefone = scanner.next();
        System.out.print("Rua: ");
        String rua = scanner.next();
        System.out.print("Número: ");
        String numero = scanner.next();
        System.out.print("Cidade: ");
        String cidade = scanner.next();
        System.out.print("Estado: ");
        String estado = scanner.next();

        Endereco endereco = new Endereco(rua, numero, cidade, estado);
        Cliente cliente = new Cliente(nome, telefone, endereco);
        clienteController.cadastrarCliente(cliente);
        System.out.println("Cliente cadastrado com sucesso!");
    }

    private void listarClientes() {
        System.out.println("Lista de Clientes:");
        for (Cliente cliente : clienteController.listarClientes()) {
            System.out.println(cliente);
        }
    }
}

