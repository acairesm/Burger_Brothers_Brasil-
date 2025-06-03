package Model;

public class Hamburguer extends Produto {
    public String tipoCarne;
    public boolean temQueijo;

    public Hamburguer(String nome, double preco, String tipoCarne, boolean temQueijo) {
        super(nome, preco);
        this.tipoCarne = tipoCarne;
        this.temQueijo = temQueijo;
    }

    // Getters e Setters (opcional)
}
