package Model;

class PagamentoDinheiro extends Pagamento {
    public PagamentoDinheiro(double valor) { super(valor); }
    public void realizarPagamento() {
        System.out.println("Pagamento em dinheiro: R$" + valor);
    }
}
