/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EVA2_11_ARREGLOS;

/**
 *
 * @author User
 */
public class EVA2_11_ARREGLOS {

    public static void main(String[] args) {
        int[] arreglo = new int[10];
        arreglo[0] = 100;
        System.out.println("El valor en la posición [0] es: " + arreglo[0]);

        String[] array = new String[10];
        array[5] = "Hola mundo";
        System.out.println(array[5]);

        double[] arrayDouble = new double[10000];
        arrayDouble[255] = 2.541523;
        System.out.println(arrayDouble[255]);

        Persona[] people = new Persona[17];

    }
}

class Persona {

    //ATRIBUTOS
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
