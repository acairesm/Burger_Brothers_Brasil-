package Model;
import java.io.Serializable;

public abstract class Pagamento implements Serializable{
    protected double valor;
    protected String metodo;

    public Pagamento(double valor, String metodo) {
        this.valor = valor;
        this.metodo = metodo;
    }

    public double getValor() {
        return valor;
    }

    public String getMetodo() {
        return metodo;
    }

    public abstract void processarPagamento();

    @Override
    public String toString() {
        return "Pagamento: R$ " + valor + ", Método: " + metodo;
    }
}
