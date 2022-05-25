package EVA3_10_FINALLY;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class EVA3_10_FINALLY {

    public static void main(String[] args) {
        // TODO code application logic here
        try {
            Scanner momento = new Scanner(System.in);
            System.out.print("Ingresa un número entero: ");
            int num = momento.nextInt();
            System.out.println("Ingresaste: " + num);
        } catch (InputMismatchException e) {
            e.printStackTrace();
        } finally { //Hace que lo que este en este bloque siempre se ejecute
            System.out.println("Esta línea siempre debe de ejecutarse.");
        }
        System.out.println("Fin del programa.");
    }
}
