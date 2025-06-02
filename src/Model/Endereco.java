package Model;

class Endereco {
    private String rua;
    private String numero;
    private String cidade;

    public Endereco(String rua, String numero, String cidade) {
        this.rua = rua;
        this.numero = numero;
        this.cidade = cidade;
    }

    public String toString() {
        return rua + ", " + numero + ", " + cidade;
    }
}
