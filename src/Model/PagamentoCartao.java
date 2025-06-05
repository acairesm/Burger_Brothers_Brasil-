package Model;

public class PagamentoCartao extends Pagamento {
    public PagamentoCartao(double valor) {
        super(valor, "Cartão");
    }

    @Override
    public void processarPagamento() {
        System.out.println("Pagamento de R$ " + valor + " processado via cartão.");
    }
}
