/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EVA2_13_ARREGLOS_3;

import java.util.Scanner;

/**
 *
 * @author Andrijo
 */
public class EVA2_13_ARREGLOS_3 {

    public static void main(String[] args) {
        Scanner momento = new Scanner(System.in);
        Persona[] arrayPeople = new Persona[10];
        for (int i = 0; i < 10; i++) {
            //Crear el objeto
            arrayPeople[i] = new Persona();
            System.out.print((i + 1) + ". ¿Cuál es tu nombre?: ");
            arrayPeople[i].setNombre(momento.nextLine());
        }
        for (int i = 0; i < 10; i++) {
            System.out.println((i + 1) + ". Nombre: " + arrayPeople[i].getNombre());
        }
    }
}

class Persona {

    private String nombre;

    public Persona() {
    }

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
