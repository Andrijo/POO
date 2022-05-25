package EVA3_9_CLASE_EXCEPTION;

import java.util.Scanner;

/**
 *
 * @author Andrijo
 */
public class EVA3_9_CLASE_EXCEPTION {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner momento = new Scanner(System.in);
        int num, num2;

        try {
            System.out.print("1. Introduce un número: ");
            num = momento.nextInt();
            System.out.print("2. Introduce un número: ");
            num2 = momento.nextInt();
            System.out.println("División: " + (num / num2));
        } catch (Exception e) {
            System.out.println("Se introdujo un número inválido");
        }
    }
}
