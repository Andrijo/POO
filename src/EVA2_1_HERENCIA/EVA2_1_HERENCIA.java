/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EVA2_1_HERENCIA;

/**
 *
 * @author User
 */
public class EVA2_1_HERENCIA {

    public static void main(String[] args) {
        Estudiante student = new Estudiante();
        student.setNombre("Andy");
        student.setEdad(19);
        student.setNumeroControl("LC205546HC");
        student.imprimirDatos();
        System.out.println("Número de control: " + student.getNumeroControl());
    }
}

class Persona {

    //ATRIBUTOS
    private int edad;
    private String nombre;

    //CONSTRUCTORES
    public Persona() {
        this.nombre = "";
        this.edad = 0;
    }

    public Persona(int edad, String nombre) {
        this.edad = edad;
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void imprimirDatos() {
        System.out.println("Nombre: " + getNombre());
        System.out.println("Edad: " + getEdad());
    }

}

class Estudiante extends Persona {

    //ATRIBUTOS
    private String numeroControl;

    public String getNumeroControl() {
        return numeroControl;
    }

    public void setNumeroControl(String numeroControl) {
        this.numeroControl = numeroControl;
    }
}
