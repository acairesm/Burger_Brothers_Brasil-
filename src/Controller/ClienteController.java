package Controller;

import java.util.ArrayList;

class ClienteController {
    private List<Cliente> clientes = new ArrayList<>();

    public void cadastrarCliente(Cliente cliente) {
        clientes.add(cliente);
        System.out.println("Cliente cadastrado com sucesso!");
    }

    public List<Cliente> getClientes() { return clientes; }
}

