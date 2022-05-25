package EVA3_3_DIVISION_CERO;

import java.util.Scanner;

/**
 *
 * @author Andrijo
 */
public class EVA3_3_DIVISION_CERO {
    public static void main(String[] args) {
        Scanner momento = new Scanner(System.in);
        int num, number;
        System.out.println("1. Introduce un número: ");
        num = momento.nextInt();
        System.out.println("2. Introduce un número: ");
        number = momento.nextInt();
        
        System.out.println("División: " + (num/number));
    }
}
