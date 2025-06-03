package Model;

public class Bebida extends Produto {
    public boolean isAlcoolica;

    public Bebida(String nome, double preco, boolean isAlcoolica) {
        super(nome, preco);
        this.isAlcoolica = isAlcoolica;
    }

    // Getters e Setters (opcional)
}
