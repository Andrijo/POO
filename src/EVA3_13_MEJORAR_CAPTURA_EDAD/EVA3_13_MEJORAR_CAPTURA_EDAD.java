package EVA3_13_MEJORAR_CAPTURA_EDAD;

import java.util.Scanner;

/**
 *
 * @author Andrijo
 */
public class EVA3_13_MEJORAR_CAPTURA_EDAD {

    public static void main(String[] args) {
        // TODO code application logic here
        boolean datoErroneo = true;
        do {
            Scanner momento = new Scanner(System.in);
            int edad = 0;
            try {
                System.out.print("Ingresa tu edad [entero]: ");
                edad = momento.nextInt();
                if (edad < 0) {
                    throw new Exception(edad + " no es una edad válida.");
                }
                System.out.println("Tu edad es: " + edad);
                datoErroneo = false;
            } catch (Exception ex) {
                System.out.println(edad + " no es una edad válida.");
            }
        } while (datoErroneo);

    }

}
