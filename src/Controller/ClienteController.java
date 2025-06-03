package Controller;

import Model.Cliente;
import java.util.ArrayList;
import java.util.List;

public class ClienteController {
    private static List<Cliente> clientes = new ArrayList<>();


    public static void cadastrarCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public static List<Cliente> listarClientes() {
        return clientes;
    }

    public void editarCliente(Cliente cliente) {
        // Implementar lógica para editar cliente
    }

    public void deletarCliente(Cliente cliente) {
        clientes.remove(cliente);
    }
}


