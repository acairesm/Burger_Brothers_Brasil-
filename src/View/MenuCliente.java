package View;

import Controller.ClienteController;
import Model.Cliente;
import Model.Endereco;

public class MenuCliente {
    public static void exibir() {
        int opcao = 0;
        do {
            System.out.println("----------------------------");
            System.out.println("Menu de Clientes:");
            System.out.println("1. Cadastrar Cliente");
            System.out.println("2. Listar Clientes");
            System.out.println("3- Excluir Cliente");
            System.out.println("4- Mudar Infos do Cliente");
            System.out.println("0. Voltar");
            System.out.println("----------------------------");
            opcao = InputHelper.lerInt("Escolha uma opção: ");

            switch (opcao) {
                case 1 -> cadastrarCliente();
                case 2 -> listarClientes();
                case 3 -> excluirCliente();
                case 4 -> mudarInfos();
                case 0 -> System.out.println("Voltando ao menu principal...");
                default -> System.out.println("Opção inválida!");
            }
        } while (opcao != 0);
    }

    private static void cadastrarCliente() {
        System.out.println("---------Cadastrar Cliente---------");
        String cpf = InputHelper.lerString("CPF: ");
        String nome = InputHelper.lerString("Nome: ");
        String telefone = InputHelper.lerString("Telefone: ");
        String rua = InputHelper.lerString("Rua: ");
        String numero = InputHelper.lerString("Numero: ");
        String cidade = InputHelper.lerString("Cidade: ");
        String estado = InputHelper.lerString("Estado: ");

        Endereco endereco = new Endereco(rua, numero, cidade, estado);
        Cliente cliente = new Cliente(cpf,nome, telefone, endereco);
        ClienteController.cadastrarCliente(cliente);
    }

    private static void listarClientes() {
        System.out.println("---------Lista de Clientes---------");
        for (Cliente cliente : ClienteController.listarClientes()) {
            System.out.println(cliente);
        }
    }

    private static void excluirCliente() {
        System.out.println("---------Excluir Cliente---------");
        String cpf = InputHelper.lerString("Digite o CPF do cliente ");
        ClienteController.deletarCliente(cpf);

    }

    private static void mudarInfos() {
        System.out.println("---------Mudar Infos---------");
        String cpf = InputHelper.lerString("Digite o CPF do cliente ");
        System.out.println("Qual informaçao voce quer editar : ");
        System.out.println("1- Nome");
        System.out.println("2- Telefone");
        System.out.println("3- Endereço-> Rua");
        System.out.println("4- Endereço-> Numero");
        System.out.println("5- Endereço-> Cidade");
        System.out.println("6- Endereço-> Estado");
        int op = InputHelper.lerInt("Digite a opçao: ");
        switch (op){
            case 1 :
                String n = InputHelper.lerString("Digite o novo nome: ");
                ClienteController.editarNome(cpf,n);
                break;
            case 2 :
                String tel = InputHelper.lerString("Digite o novo telefone: ");
                ClienteController.editarTel(cpf,tel);
                break;
            case 3 :
                String r = InputHelper.lerString("Digite a nova rua:");
                ClienteController.editarRua(cpf,r);
                break;
            case 4 :
                String numero = InputHelper.lerString("Digite o novo numero: ");
                ClienteController.editarNumero(cpf,numero);
                break;
            case 5 :
                String cid = InputHelper.lerString("Digite a nova cidade: ");
                ClienteController.editarCidade(cpf,cid);
                break;
            case 6 :
                String estado = InputHelper.lerString("Digite o novo estado: ");
                ClienteController.editarEstado(cpf,estado);
                break;
        }

    }
}


