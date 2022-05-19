package EVA3_5_TRY_CATCH;

import java.util.Scanner;

/**
 *
 * @author Andrijo
 */
public class EVA3_5_TRY_CATCH {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Excepciones --> OBJETOS

        Scanner momento = new Scanner(System.in);
        int edad = 0;
        System.out.print("Introduce tu edad: ");
        try {
            edad = momento.nextInt();
        } catch (Exception e) {
            System.out.println("Introduce solo enteros.");
        }
        System.out.println("Edad: " + edad);
    }

}
