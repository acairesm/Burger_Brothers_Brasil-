package Model;

public class PagamentoDinheiro extends Pagamento {
    public PagamentoDinheiro(double valor) {
        super(valor);
    }

    @Override
    public void processarPagamento() {
        System.out.println("Pagamento de " + valor + " processado em dinheiro.");
    }
}

