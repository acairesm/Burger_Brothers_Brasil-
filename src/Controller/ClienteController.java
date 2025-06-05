package Controller;

import Model.Cliente;
import Model.Endereco;

import java.util.ArrayList;
import java.util.List;

public class ClienteController {
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";

    public static List<Cliente> clientes = new ArrayList<>();

    public static void cadastrarCliente(Cliente cliente) {
        clientes.add(cliente);
        System.out.println(ANSI_GREEN + "Cliente cadastrado com sucesso!" + ANSI_RESET);
    }

    public static List<Cliente> listarClientes() {
        return clientes;
    }

    public static void deletarCliente(String cpfdelete) {
        boolean encontrado = false;
        for (Cliente c : clientes){
            if (cpfdelete.equals(c.getCpf())){
                clientes.remove(c);
                System.out.println(ANSI_GREEN +"Cliente com cpf "+ cpfdelete+ " excluido com successo! "+ ANSI_RESET);
                encontrado=true;
                break;
            }
        }
        if (!encontrado){
            System.out.println(ANSI_RED + "Cliente com cpf "+cpfdelete+" nao encontrado! "+ ANSI_RESET);
        }
    }

    public static void editarTel(String cpfedit, String tel) {
        boolean encontrado = false;
        for (Cliente c : clientes){
            if (cpfedit.equals(c.getCpf())){
                c.setTelefone(tel);
                System.out.println(ANSI_GREEN + "Telefone atualizado com sucesso!" + ANSI_RESET);
                encontrado=true;
                break;
            }
        }
        if (!encontrado){
            System.out.println(ANSI_RED + "Cliente com cpf "+cpfedit+" nao encontrado! "+ ANSI_RESET);
        }
    }

    public static void editarNome(String cpfedit , String n ) {
        boolean encontrado = false;
        for (Cliente c : clientes){
            if (cpfedit.equals(c.getCpf())){
                c.setNome(n);
                System.out.println(ANSI_GREEN + "Nome atualizado com sucesso!" + ANSI_RESET);
                encontrado=true;
                break;
            }
        }
        if (!encontrado){
            System.out.println(ANSI_RED + "Cliente com cpf "+cpfedit+" nao encontrado! "+ ANSI_RESET);
        }
    }

    public static void editarRua(String cpfedit, String r) {
        boolean encontrado = false;
        for (Cliente c : clientes){
            if (cpfedit.equals(c.getCpf())){
                c.getEndereco().setRua(r);
                System.out.println(ANSI_GREEN + "Rua atualizada com sucesso!" + ANSI_RESET);
                encontrado=true;
                break;
            }
        }
        if (!encontrado){
            System.out.println(ANSI_RED + "Cliente com cpf "+cpfedit+" nao encontrado! "+ ANSI_RESET);
        }
    }

    public static void editarNumero(String cpfedit, String numero) {
        boolean encontrado = false;
        for (Cliente c : clientes){
            if (cpfedit.equals(c.getCpf())){
                c.getEndereco().setNumero(numero);
                System.out.println(ANSI_GREEN + "Número atualizado com sucesso!" + ANSI_RESET);
                encontrado=true;
                break;
            }
        }
        if (!encontrado){
            System.out.println(ANSI_RED + "Cliente com cpf "+cpfedit+" nao encontrado! "+ ANSI_RESET);
        }
    }

    public static void editarCidade(String cpfedit, String cid) {
        boolean encontrado = false;
        for (Cliente c : clientes){
            if (cpfedit.equals(c.getCpf())){
                c.getEndereco().setCidade(cid);
                System.out.println(ANSI_GREEN + "Cidade atualizada com sucesso!" + ANSI_RESET);
                encontrado=true;
                break;
            }
        }
        if (!encontrado){
            System.out.println(ANSI_RED + "Cliente com cpf "+cpfedit+" nao encontrado! "+ ANSI_RESET);
        }
    }

    public static void editarEstado(String cpfedit, String estado) {
        boolean encontrado = false;
        for (Cliente c : clientes){
            if (cpfedit.equals(c.getCpf())){
                c.getEndereco().setEstado(estado);
                System.out.println(ANSI_GREEN + "Rua atualizada com sucesso!" + ANSI_RESET);
                encontrado=true;
                break;
            }
        }
        if (!encontrado){
            System.out.println(ANSI_RED + "Cliente com cpf "+cpfedit+" nao encontrado! "+ ANSI_RESET);
        }
    }
}


