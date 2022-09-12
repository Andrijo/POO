package Unidad_1;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class Factorial {

    public static void main(String[] args) {
        /* 
         Práctica 1 - Unidad II
         Pasos a seguir:
         1) Determinar factorial N
         2) Sumar factorial N 
         3) Completar código
         */
        /*
        Scanner momento = new Scanner(System.in);
        int n;
        double factorial, suma = 0;
        //Petición de un número entero
        do {
            System.out.print("¿Qué factorial quieres saber?");
            n = momento.nextInt();
        } while (n < 0);

        for (int i = 1; i < n; i++) {
            //Para cada número desde 1 hasta N
            factorial = 1;
            for (int j = 1; j <= i; j++) {
                factorial *= j;
            }
            //Muestra del factorial, %n -> salto de línea
            System.out.println(String.format("%n%2d! = %.0f%n", i, factorial));
            //Se suma factorial
            suma += factorial;
        }

        System.out.printf("Suma de los factoriales desde cero hasta %d:%0.f%n: ", n, suma);
                */
    }
    /*
    public static void main(String[]args){
    double factorial;
    Scanner momento = new Scanner(System.in);
    
    do{
    System.out.prtintln("Introduce un número mayor a 0");
    n = momento.nextInt();
    } while (n < 0);
    
    for(int i = 0; i < n; i++){
    factorial = 0;
    for(int j = 0; j < i; j++){
    factorial*=i;
    }
    //Se muestra el factorial
    System.out,println("%2d! = %.0f%n",i,factorial);
    
    )
    
    }
    */
}
