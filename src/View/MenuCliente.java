package View;


class MenuCliente {
    public static void executar(Scanner scanner, ClienteController controller) {
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("CPF: ");
        String cpf = scanner.nextLine();
        System.out.print("Rua: ");
        String rua = scanner.nextLine();
        System.out.print("Número: ");
        String numero = scanner.nextLine();
        System.out.print("Cidade: ");
        String cidade = scanner.nextLine();

        Endereco endereco = new Endereco(rua, numero, cidade);
        Cliente cliente = new Cliente(nome, cpf, endereco);
        controller.cadastrarCliente(cliente);
    }
}
