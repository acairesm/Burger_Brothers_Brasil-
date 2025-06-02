package Controller;

import Model.Cliente;
import java.util.ArrayList;
import java.util.List;

public class ClienteController {
    private List<Cliente> clientes;

    public ClienteController() {
        this.clientes = new ArrayList<>();
    }

    public void cadastrarCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public List<Cliente> listarClientes() {
        return clientes;
    }

    public void editarCliente(Cliente cliente) {
        // Implementar lógica para editar cliente
    }

    public void deletarCliente(Cliente cliente) {
        clientes.remove(cliente);
    }
}


