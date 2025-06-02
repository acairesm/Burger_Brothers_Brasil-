package View;

class MenuProduto {
    public static void executar(Scanner scanner, ProdutoController controller) {
        System.out.print("Nome do produto: ");
        String nome = scanner.nextLine();
        System.out.print("Preço: ");
        double preco = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Tipo (1-Hamburguer, 2-Bebida, 3-Acompanhamento): ");
        int tipo = scanner.nextInt();
        scanner.nextLine();

        Produto produto;
        switch (tipo) {
            case 1: produto = new Hamburguer(nome, preco); break;
            case 2: produto = new Bebida(nome, preco); break;
            case 3: produto = new Acompanhamento(nome, preco); break;
            default:
                System.out.println("Tipo inválido.");
                return;
        }
        controller.adicionarProduto(produto);
        System.out.println("Produto adicionado!");
    }
}
