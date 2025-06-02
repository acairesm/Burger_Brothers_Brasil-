package Model;

class PagamentoCartao extends Pagamento {
    public PagamentoCartao(double valor) { super(valor); }
    public void realizarPagamento() {
        System.out.println("Pagamento no cartão: R$" + valor);
    }
}
