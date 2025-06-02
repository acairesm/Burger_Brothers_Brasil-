package View;

import Controller.ClienteController;
import Model.Cliente;
import Model.Endereco;

public class MenuCliente {
    private final ClienteController clienteController;

    public MenuCliente(ClienteController clienteController) {
        this.clienteController = clienteController;
    }

    public void exibir() {
        int opcao = 0;
        do {
            System.out.println("Menu de Clientes:");
            System.out.println("1. Cadastrar Cliente");
            System.out.println("2. Listar Clientes");
            System.out.println("0. Voltar");
            opcao = InputHelper.lerInt("Escolha uma opcção");

            switch (opcao) {
                case 1 -> cadastrarCliente();
                case 2 -> listarClientes();
                case 0 -> System.out.println("Voltando ao menu principal...");
                default -> System.out.println("Opção inválida!");
            }
        } while (opcao != 0);
    }

    private void cadastrarCliente() {
        String nome = InputHelper.lerString("Nome: ");
        String telefone = InputHelper.lerString("Telefone: ");
        String rua = InputHelper.lerString("Rua: ");
        String numero = InputHelper.lerString("Numero: ");
        String cidade = InputHelper.lerString("Cidade: ");
        String estado = InputHelper.lerString("Estado: ");

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

