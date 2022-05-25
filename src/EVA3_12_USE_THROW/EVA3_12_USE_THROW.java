package EVA3_12_USE_THROW;

import java.util.Scanner;

/**
 *
 * @author Andrijo
 */
public class EVA3_12_USE_THROW {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner momento = new Scanner(System.in);
        int edad = 0;
        try {
            System.out.print("Ingresa tu edad [entero]: ");
            edad = momento.nextInt();
            if (edad < 0) {
                throw new Exception(edad + " no es una edad válida.");
            }
            System.out.println("Tu edad es: " + edad);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
