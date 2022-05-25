package EVA3_7_USO_EXCEPCIONES;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA3_7_USO_EXCEPCIONES {

    public static void main(String[] args) {
        // TODO code application logic here
        boolean datoErroneo = true; //EL usuario siempre se equivoca
        do {
            try {
                Scanner momento = new Scanner(System.in);
                System.out.print("Ingresa tu edad: ");
                int edad = momento.nextInt();
                System.out.println("Edad: " + edad);
                datoErroneo = false;
            } catch (InputMismatchException e) {
                System.out.println("Ingresa solo datos enteros.");
            }
        } while (datoErroneo);
    }
}
