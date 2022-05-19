/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EVA2_9_CLASES_ABSTRACTAS;

/**
 *
 * @author Andrijo
 */
public class EVA2_9_CLASES_ABSTRACTAS {

    public static void main(String[] args) {
        Persona people = new Persona("Andy", 19) {
            @Override
            public void mostrarDatos() {
                System.out.println("Nombre: " + getNombre());
                System.out.println("Edad: " + getEdad());
            }
        };
        
    }
}

interface MuestraDatos {

    public void mostrarDatos();
}

abstract class Persona implements MuestraDatos {

    private String nombre;
    private int edad;

    public Persona() {
    }

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

}
