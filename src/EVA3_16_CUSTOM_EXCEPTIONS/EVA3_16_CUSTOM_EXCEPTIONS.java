package EVA3_16_CUSTOM_EXCEPTIONS;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Andrijo
 */
public class EVA3_16_CUSTOM_EXCEPTIONS {

    public static void main(String[] args) throws CatchingException {
        Scanner momento = new Scanner(System.in);
        System.out.println("Captura de edad: ");
        int value;
        try {
            value = momento.nextInt();
        } catch (InputMismatchException e) {
            throw new CatchingException("Se ingresó un texto.");
        }
    }
}

//Excepción personalizada
//Herencia de excepción
class CatchingException extends Exception {

    public CatchingException() {

    }

    public CatchingException(String message) {
        super(message);
    }

}
