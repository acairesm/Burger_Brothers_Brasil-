package View;

import java.util.Scanner;

public class InputHelper {
    private static Scanner scanner = new Scanner(System.in);

    public static int lerInt(String mensagem) {
        System.out.print(mensagem);
        while (!scanner.hasNextInt()) {
            System.out.print("Valor inválido. Digite um número inteiro: ");
            scanner.next();
        }
        return scanner.nextInt();
    }

    public static String lerString(String mensagem) {
        System.out.print(mensagem);
        return scanner.nextLine();
    }

    public static double lerDouble(String mensagem) {
        System.out.print(mensagem);
        while (!scanner.hasNextDouble()) {
            System.out.print("Valor inválido. Digite um número decimal: ");
            scanner.next();
        }
        return scanner.nextDouble();
    }

    public static float lerFloat(String mensagem) {
        System.out.print(mensagem);
        while (!scanner.hasNextFloat()) {
            System.out.print("Valor inválido. Digite um número decimal: ");
            scanner.next();
        }
        return scanner.nextFloat();
    }
}
