package Model;

public class Acompanhamento extends Produto {
    public String tipo;

    public Acompanhamento(String nome, double preco, String tipo) {
        super(nome, preco);
        this.tipo = tipo;
    }

    // Getters e Setters (opcional)
}
