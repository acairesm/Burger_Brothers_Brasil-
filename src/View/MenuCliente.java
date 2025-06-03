package View;

import Controller.ClienteController;
import Model.Cliente;
import Model.Endereco;

public class MenuCliente {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_RED = "\u001B[31m";
    private static final String ANSI_YELLOW = "\u001B[33m";

    public static void exibir() {
        int opcao = 0;
        do {
            System.out.println(ANSI_BLUE + "============================" + ANSI_RESET);
            System.out.println(ANSI_BLUE + "       MENU CLIENTES" + ANSI_RESET);
            System.out.println(ANSI_BLUE + "============================" + ANSI_RESET);
            System.out.println(ANSI_GREEN + "[1] Cadastrar Cliente" + ANSI_RESET);
            System.out.println(ANSI_GREEN + "[2] Listar Clientes" + ANSI_RESET);
            System.out.println(ANSI_GREEN + "[3] Excluir Cliente" + ANSI_RESET);
            System.out.println(ANSI_GREEN + "[4] Mudar Infos do Cliente" + ANSI_RESET);
            System.out.println(ANSI_YELLOW + "[0] Voltar" + ANSI_RESET);
            System.out.println(ANSI_BLUE + "============================" + ANSI_RESET);
            opcao = InputHelper.lerInt("Escolha uma opção: ");

            switch (opcao) {
                case 1:
                    cadastrarCliente();
                case 2:
                    listarClientes();
                case 3:
                    excluirCliente();
                case 4:
                    mudarInfos();
                case 0:
                    System.out.println(ANSI_GREEN + "Voltando ao menu principal..." + ANSI_RESET);
                default:
                    System.out.println(ANSI_RED + "Opção inválida!" + ANSI_RESET);
            }
        } while (opcao != 0);
    }

    private static void cadastrarCliente() {
        System.out.println(ANSI_BLUE + "--------- Cadastrar Cliente ---------" + ANSI_RESET);
        String cpf = InputHelper.lerString("CPF: ");
        String nome = InputHelper.lerString("Nome: ");
        String telefone = InputHelper.lerString("Telefone: ");
        String rua = InputHelper.lerString("Rua: ");
        String numero = InputHelper.lerString("Número: ");
        String cidade = InputHelper.lerString("Cidade: ");
        String estado = InputHelper.lerString("Estado: ");

        Endereco endereco = new Endereco(rua, numero, cidade, estado);
        Cliente cliente = new Cliente(cpf,nome, telefone, endereco);
        ClienteController.cadastrarCliente(cliente);
    }

    private static void listarClientes() {
        System.out.println(ANSI_BLUE + "--------- Lista de Clientes ---------" + ANSI_RESET);
        for (Cliente cliente : ClienteController.listarClientes()) {
            System.out.println(cliente);
        }
    }

    private static void excluirCliente() {
        System.out.println(ANSI_BLUE + "--------- Excluir Cliente ---------" + ANSI_RESET);
        String cpf = InputHelper.lerString("Digite o CPF do cliente ");
        ClienteController.deletarCliente(cpf);
    }

    private static void mudarInfos() {
        System.out.println(ANSI_BLUE + "--------- Mudar Infos ---------" + ANSI_RESET);

        Cliente clienteEncontrado = null;
        
        while (clienteEncontrado == null) {
            String cpf = InputHelper.lerString("Digite o CPF do cliente: ");
            for (Cliente c : ClienteController.clientes) {
                if (c.getCpf().equals(cpf)) {
                    clienteEncontrado = c;
                    break;
                }else {
                    System.out.println(ANSI_RED +"Cliente não encontrado... Digite um CPF existente! "+ ANSI_RESET);

                }
            }
        }
        if (clienteEncontrado == null) {
            System.out.println(ANSI_RED + "CPF não encontrado! Tente novamente." + ANSI_RESET);
        } else {
            // Menu de alteração
            System.out.println("Qual informação você quer editar:");
            System.out.println("[1] - Nome");
            System.out.println("[2] - Telefone");
            System.out.println("[3] - Endereço -> Rua");
            System.out.println("[4] - Endereço -> Número");
            System.out.println("[5] - Endereço -> Cidade");
            System.out.println("[6]- Endereço -> Estado");

            int op = InputHelper.lerInt("Digite a opção: ");

            String cpf = clienteEncontrado.getCpf();

            switch (op) {
                case 1:
                    String novoNome = InputHelper.lerString("Digite o novo nome: ");
                    ClienteController.editarNome(cpf, novoNome);
                    break;
                case 2:
                    String novoTel = InputHelper.lerString("Digite o novo telefone: ");
                    ClienteController.editarTel(cpf, novoTel);
                    break;
                case 3:
                    String novaRua = InputHelper.lerString("Digite a nova rua: ");
                    ClienteController.editarRua(cpf, novaRua);
                    break;
                case 4:
                    String novoNumero = InputHelper.lerString("Digite o novo número: ");
                    ClienteController.editarNumero(cpf, novoNumero);
                    break;
                case 5:
                    String novaCidade = InputHelper.lerString("Digite a nova cidade: ");
                    ClienteController.editarCidade(cpf, novaCidade);
                    break;
                case 6:
                    String novoEstado = InputHelper.lerString("Digite o novo estado: ");
                    ClienteController.editarEstado(cpf, novoEstado);
                    break;
                default:
                    System.out.println(ANSI_RED + "Opção inválida!" + ANSI_RESET);
            }
        }
    }


}


