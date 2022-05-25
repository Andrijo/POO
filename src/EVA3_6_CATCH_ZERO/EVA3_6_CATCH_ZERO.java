package EVA3_6_CATCH_ZERO;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Andrijo
 */
public class EVA3_6_CATCH_ZERO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner momento = new Scanner(System.in);
        int num, num2;

        System.out.print("Introduce un número: ");
        num = momento.nextInt();
        System.out.print("Introduce un segundo número: ");
        num2 = momento.nextInt();

        try {
            System.out.println("División: " + (num / num2));
        } catch (InputMismatchException e ) {
            //e.printStackTrace(); //Imprimir el error sin que se detenga el programa
            System.out.println("Se produjo that mother");
        }
        System.out.println("Fin del programa");
    }

}
