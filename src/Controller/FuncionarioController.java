package Controller;

import Model.Funcionario;

import java.util.ArrayList;
import java.util.List;

public class FuncionarioController {

    private static List<Funcionario> funcionarios = new ArrayList<>();

    // Método para adicionar funcionários de exemplo (pode ser substituído depois por leitura de arquivo ou banco)
    static {
        funcionarios.add(new Funcionario("111111","LOLO","13131313","kjdjd","CU","KCJSF","121212");
        funcionarios.add(new Funcionario("Maria Oliveira", "Cozinheira"));
        funcionarios.add(new Funcionario("Carlos Souza", "Gerente"));
    }

    public static List<Funcionario> listarFuncionarios() {
        return funcionarios;
    }

    public static void adicionarFuncionario(Funcionario funcionario) {
        funcionarios.add(funcionario);
    }

    public static Funcionario buscarFuncionarioPorIndice(int indice) {
        if (indice >= 0 && indice < funcionarios.size()) {
            return funcionarios.get(indice);
        } else {
            return null;
        }
    }
}