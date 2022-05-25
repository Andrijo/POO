/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EVA3_8_MULTIPLES_CATCH;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Andrijo
 */
public class EVA3_8_MULTIPLES_CATCH {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner momento = new Scanner(System.in);
        int num, num2;

        try {
            System.out.println("1. Introduce un número: ");
            num = momento.nextInt();
            System.out.println("2. Introduce un número: ");
            num2 = momento.nextInt();
            System.out.println("División: " + (num / num2));
        } catch (ArithmeticException e) {
            System.out.println("Se produjo una división entre cero.");
        } catch (InputMismatchException e) {
            System.out.println("Introduce solo enteros");
        }
    }
}
