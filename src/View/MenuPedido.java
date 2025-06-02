}
public void exibir() {
    int opcao;
    do {
        System.out.println("Menu de Pedidos:");
        System.out.println("1. Criar Pedido");
        System.out.println("2. Listar Pedidos");
        System.out.println("0. Voltar");
        System.out.print("Escolha uma opção: ");
        opcao = scanner.nextInt();
        switch (opcao) {
            case 1:
                criarPedido();
                break;
            case 2:
                listarPedidos();
                break;
            case 0:
                System.out.println("Voltando ao menu principal...");
                break;
            default:
                System.out.println("Opção inválida!");
        }
    } while (opcao != 0);
}
private void criarPedido() {
    // Implementar lógica para criar pedido
    // Exemplo simplificado
    System.out.println("Criando pedido...");
    // Aqui você pode adicionar lógica para selecionar cliente, funcionario e produtos
}
private void listarPedidos() {
    System.out.println("Lista de Pedidos:");
    for (Pedido pedido : pedidoController.listarPedidos()) {
        System.out.println(pedido);
    }
}
}

