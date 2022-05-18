/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EVA2_12_ARREGLOS_2;

import java.util.Scanner;

/**
 *
 * @author Andrijo
 */
public class EVA2_12_ARREGLOS_2 {

    public static void main(String[] args) {
        Scanner momento = new Scanner(System.in);
        int[] arreglo = new int[32];
        //Llenado de arreglo
        for (int i = 0; i < 25; i++) {
            System.out.print("¿Cuál es tu edad?: ");
            arreglo[i] = momento.nextInt();
        }
        //Mostrar los datos del arreglo
        for (int i = 0; i < 25; i++) {
            System.out.println((i + 1) + ".[" + arreglo[i] + "]");
        }

    }
}
