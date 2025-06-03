package Controller;

import Model.Cliente;
import Model.Endereco;

import java.util.ArrayList;
import java.util.List;

public class ClienteController {
    private static List<Cliente> clientes = new ArrayList<>();

    public static void cadastrarCliente(Cliente cliente) {
        clientes.add(cliente);
        System.out.println("Cliente cadastrado com sucesso!");
    }

    public static List<Cliente> listarClientes() {
        return clientes;
    }

    public static void deletarCliente(String cpfdelete) {
        boolean encontrado = false;
        for (Cliente c : clientes){
            if (cpfdelete.equals(c.getCpf())){
                clientes.remove(c);
                System.out.println("Cliente com cpf "+ cpfdelete+ " excluido com successo! ");
                encontrado=true;
                break;
            }
        }
        if (!encontrado){
            System.out.println("Cliente com cpf "+cpfdelete+" nao encontrado! ");
        }
    }

    public static void editarTel(String cpfedit, String tel) {
        boolean encontrado = false;
        for (Cliente c : clientes){
            if (cpfedit.equals(c.getCpf())){
                c.setTelefone(tel);
                System.out.println("Telefone alterado com successo! ");
                encontrado=true;
                break;
            }
        }
        if (!encontrado){
            System.out.println("Cliente com cpf "+cpfedit+" nao encontrado! ");
        }
    }

    public static void editarNome(String cpfedit , String n ) {
        boolean encontrado = false;
        for (Cliente c : clientes){
            if (cpfedit.equals(c.getCpf())){
                c.setNome(n);
                System.out.println("Nome alterado com successo! ");
                encontrado=true;
                break;
            }
        }
        if (!encontrado){
            System.out.println("Cliente com cpf "+cpfedit+" nao encontrado! ");
        }
    }

    public static void editarRua(String cpfedit, String r) {
        boolean encontrado = false;
        for (Cliente c : clientes){
            if (cpfedit.equals(c.getCpf())){
                c.getEndereco().setRua(r);
                System.out.println("Rua alterada com successo !");
                encontrado=true;
                break;
            }
        }
        if (!encontrado){
            System.out.println("Cliente com cpf "+cpfedit+" nao encontrado! ");
        }
    }

    public static void editarNumero(String cpfedit, String numero) {
        boolean encontrado = false;
        for (Cliente c : clientes){
            if (cpfedit.equals(c.getCpf())){
                c.getEndereco().setNumero(numero);
                System.out.println("Numero alterada com successo !");
                encontrado=true;
                break;
            }
        }
        if (!encontrado){
            System.out.println("Cliente com cpf "+cpfedit+" nao encontrado! ");
        }
    }

    public static void editarCidade(String cpfedit, String cid) {
        boolean encontrado = false;
        for (Cliente c : clientes){
            if (cpfedit.equals(c.getCpf())){
                c.getEndereco().setCidade(cid);
                System.out.println("Cidade alterada com successo ");
                encontrado=true;
                break;
            }
        }
        if (!encontrado){
            System.out.println("Cliente com cpf "+cpfedit+" nao encontrado! ");
        }
    }

    public static void editarEstado(String cpfedit, String estado) {
        boolean encontrado = false;
        for (Cliente c : clientes){
            if (cpfedit.equals(c.getCpf())){
                c.getEndereco().setEstado(estado);
                System.out.println("Rua alterada com successo ");
                encontrado=true;
                break;
            }
        }
        if (!encontrado){
            System.out.println("Cliente com cpf "+cpfedit+" nao encontrado! ");
        }
    }
}


