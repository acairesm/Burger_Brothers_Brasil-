package View;

MenuPedido {
    public static void executar(Scanner scanner, ClienteController clienteController, ProdutoController produtoController, PedidoController pedidoController, PagamentoController pagamentoController) {
        if (clienteController.getClientes().isEmpty()) {
            System.out.println("Nenhum cliente cadastrado.");
            return;
        }

        System.out.println("Clientes:");
        List<Cliente> clientes = clienteController.getClientes();
        for (int i = 0; i < clientes.size(); i++) {
            System.out.println(i + " - " + clientes.get(i).getNome());
        }
        System.out.print("Escolha o cliente: ");
        int indice = scanner.nextInt();
        Cliente cliente = clientes.get(indice);

        Pedido pedido = new Pedido(cliente);
        List<Produto> produtos = produtoController.listarProdutos();

        while (true) {
            System.out.println("Produtos:");
            for (int i = 0; i < produtos.size(); i++) {
                System.out.println(i + " - " + produtos.get(i).getDescricao() + " R$" + produtos.get(i).getPreco());
            }
            System.out.print("Escolha o produto (ou -1 para finalizar): ");
            int prodIndex = scanner.nextInt();
            if (prodIndex == -1) break;

            System.out.print("Quantidade: ");
            int qtd = scanner.nextInt();
            pedido.adicionarItem(new ItemPedido(produtos.get(prodIndex), qtd));
        }

        pedidoController.registrarPedido(pedido);
        System.out.println("Total: R$" + pedido.calcularTotal());
        System.out.print("Forma de pagamento (1-Cartão, 2-Dinheiro): ");
        int forma = scanner.nextInt();
        Pagamento pagamento = (forma == 1) ? new PagamentoCartao(pedido.calcularTotal()) : new PagamentoDinheiro(pedido.calcularTotal());
        pagamentoController.processarPagamento(pagamento);
    }
}

