package Model;

public class PagamentoDinheiro extends Pagamento {
    public PagamentoDinheiro(double valor) {
        super(valor, "Dinheiro");
    }

    @Override
    public void processarPagamento() {
        System.out.println("Pagamento de R$ " + valor + " processado em dinheiro.");
    }
}
