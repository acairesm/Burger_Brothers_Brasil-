package Controller;

import Model.Pagamento;

import java.util.ArrayList;
import java.util.List;

public class PagamentoController {
    private static List<Pagamento> pagamentos = new ArrayList<>();

    public static void adicionarPagamento(Pagamento pagamento) {
        pagamentos.add(pagamento);
        System.out.println("Pagamento registrado com sucesso!");
    }

    public static List<Pagamento> listarPagamentos() {
        return pagamentos;
    }

    public static void removerPagamento(int indice) {
        if (indice >= 0 && indice < pagamentos.size()) {
            pagamentos.remove(indice);
            System.out.println("Pagamento removido com sucesso!");
        } else {
            System.out.println("Índice inválido para remoção de pagamento!");
        }
    }

    public static void reembolsarPagamento(int indice) {
        // Implementar lógica de reembolso
        if (indice >= 0 && indice < pagamentos.size()) {
            System.out.println("Pagamento reembolsado: " + pagamentos.get(indice));
            removerPagamento(indice);
        } else {
            System.out.println("Índice inválido para reembolso!");
        }
    }

    public static void processarPagamento(Pagamento pagamento) {
        adicionarPagamento(pagamento);
        pagamento.processarPagamento();
    }
}
