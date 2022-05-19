/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EVA2_6_HERENCIA_INTERFACES;

/**
 *
 * @author Andrijo
 */
public class EVA2_6_HERENCIA_INTERFACES {

    public static void main(String[] args) {
        Estudiante student = new Estudiante("LC21447", "Andy", 19);
        student.imprimirDatos();
    }
}

class Estudiante extends Persona implements MuestraDatos {

    private String numeroControl;

    public Estudiante() {
        super(); //Constructor de persona
        this.numeroControl = "";
    }

    public Estudiante(String numeroControl, String nombre, int edad) {
        super(nombre, edad); //Constructor de persona
        this.numeroControl = numeroControl;
    }

    public String getNumeroControl() {
        return numeroControl;
    }

    public void setNumeroControl(String numeroControl) {
        this.numeroControl = numeroControl;
    }

    @Override
    public void imprimirDatos() {
        System.out.println("Nombre: " + getNombre());
        System.out.println("Edad: " + getEdad());
        System.out.println("Número de control: " + getNumeroControl());
    }

}

interface MuestraDatos {

    public void imprimirDatos();
}

class Persona {

    private String nombre;
    private int edad;

    public Persona() {
        this.nombre = "";
        this.edad = 0;
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

