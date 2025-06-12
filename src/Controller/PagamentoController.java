package Controller;

import Model.Pagamento;
import Util.LoggerService;
import View.InputHelper;

import java.util.ArrayList;
import java.util.List;

public class PagamentoController {
    private static List<Pagamento> pagamentos = new ArrayList<>();

    public static void adicionarPagamento(Pagamento pagamento) {
        if (pagamento.getValor() <= 0) {
            System.out.println("Erro: Valor do pagamento deve ser maior que zero.");
            return;
        }
        pagamentos.add(pagamento);
        LoggerService.log("CREATE: Pagamento registrado - " + pagamento);
        System.out.println("Pagamento registrado com sucesso!");
    }

    public static List<Pagamento> listarPagamentos() {
        LoggerService.log("READ: Listagem de pagamentos solicitada.");
        return new ArrayList<>(pagamentos); // Retorna copia para evitar modificações externas
    }

    public static void removerPagamento(int indice) {
        if (indice < 0 || indice >= pagamentos.size()) {
            System.out.println("Índice inválido para remoção de pagamento!");
            return;
        }
        Pagamento p = pagamentos.get(indice);
        pagamentos.remove(indice);
        System.out.println("Pagamento removido com sucesso: " + p);
    }

    public static boolean confirmarReembolso(int indice) {
        if (indice < 0 || indice >= pagamentos.size()) {
            System.out.println("Índice inválido para reembolso!");
            return false;
        }
        Pagamento p = pagamentos.get(indice);
        System.out.println("Você tem certeza que deseja reembolsar o seguinte pagamento?");
        System.out.println("-> " + p);
        String resposta = InputHelper.lerString("Digite 's' para confirmar ou qualquer outra tecla para cancelar: ");
        if (resposta.equalsIgnoreCase("s")) {
            pagamentos.remove(indice);
            LoggerService.log("DELETE: Pagamento reembolsado - " + p);
            System.out.println("Pagamento reembolsado com sucesso.");
            return true;
        } else {
            System.out.println("Reembolso cancelado.");
            return false;
        }
    }

    public static void processarPagamento(Pagamento pagamento) {
        adicionarPagamento(pagamento);
        if (pagamento.getValor() > 0) { // só processa se valor válido
            pagamento.processarPagamento();
        }
    }
}
