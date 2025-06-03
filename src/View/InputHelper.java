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
