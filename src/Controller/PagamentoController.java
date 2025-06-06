package Controller;

import Model.Pagamento;
import Util.LoggerService;

import java.util.ArrayList;
import java.util.List;

public class PagamentoController {
    private static List<Pagamento> pagamentos = new ArrayList<>();

    public static void adicionarPagamento(Pagamento pagamento) {
        pagamentos.add(pagamento);
        LoggerService.log("CREATE: Pagamento registrado - " + pagamento.toString());
        System.out.println("Pagamento registrado com sucesso!");
    }

    public static List<Pagamento> listarPagamentos() {
        LoggerService.log("READ: Listagem de pagamentos solicitada.");
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
        if (indice >= 0 && indice < pagamentos.size()) {
            LoggerService.log("DELETE: Pagamento reembolsado e removido - " + pagamentos.get(indice).toString());
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