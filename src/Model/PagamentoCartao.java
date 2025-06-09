package Model;
import java.io.Serializable;

public class PagamentoCartao extends Pagamento implements Serializable{
    public PagamentoCartao(double valor) {
        super(valor, "Cartão");
    }

    @Override
    public void processarPagamento() {
        System.out.println("Pagamento de R$ " + valor + " processado via cartão.");
    }
}
