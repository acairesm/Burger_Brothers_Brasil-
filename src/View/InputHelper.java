package View;

import java.util.Scanner;

public class InputHelper {
    private static Scanner scanner = new Scanner(System.in);

    public static int lerInt(String texto){
        int num = 0;
        boolean valido= false;
        do {
            try {
                System.out.print(texto);
                num= Integer.parseInt(scanner.nextLine());
                valido= true;
            } catch (NumberFormatException e) {
                System.out.println("Enter a valid number");
            }
        }while (valido=false);
        return num;
    }

    public static String lerString(String mensagem) {
        System.out.print(mensagem);
        String txt = scanner.nextLine();
        return txt;
    }

    public static float lerFloat(String texto) {
        float num = 0;
        boolean valido = false;
        do {
            try {
                System.out.print(texto);
                num = Float.parseFloat(scanner.nextLine());
                valido = true;
            } catch (NumberFormatException e) {
                System.out.println("Digite um número válido.");
            }
        } while (!valido);
        return num;
    }

    public static boolean lerBoolean(String texto) {
        boolean valido = false;
        boolean valor = false;
        do {
            System.out.print(texto + " (Sim/Não): ");
            String input = scanner.nextLine().trim().toLowerCase();
            if (input.equals("true")) {
                valor = true;
                valido = true;
            } else if (input.equals("Não")) {
                valor = false;
                valido = true;
            } else {
                System.out.println("Digite 'Sim' ou 'Não'.");
            }
        } while (!valido);
        return valor;
    }



}
