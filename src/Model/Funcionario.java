package Model;

public class Funcionario extends Pessoa {
    private String cargo;
    private String login;
    private String senha;

    public Funcionario(String nome, String telefone, Endereco endereco, String cargo, String login, String senha) {
        super(nome, telefone, endereco);
        this.cargo = cargo;
        this.login = login;
        this.senha = senha;
    }

    public boolean autenticar(String login, String senha) {
        return this.login.equals(login) && this.senha.equals(senha);
    }

    @Override
    public String toString() {
        return super.toString() + ", Cargo: " + cargo;
    }
}

