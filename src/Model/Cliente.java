package Model;

class Cliente extends Pessoa {
    private Endereco endereco;

    public Cliente(String nome, String cpf, Endereco endereco) {
        super(nome, cpf);
        this.endereco = endereco;
    }

    public Endereco getEndereco() { return endereco; }
}
