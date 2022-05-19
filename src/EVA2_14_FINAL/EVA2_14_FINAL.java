/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EVA2_14_FINAL;

/**
 *
 * @author Andrijo
 */
public class EVA2_14_FINAL {

    public static void main(String[] args) {

    }

}

/*class estudiantePosgrado {

}*/
final class estudiante extends Persona {

    //Atributos
    private String numeroControl;

    public estudiante() {
    }

    public estudiante(String numeroControl) {
        this.numeroControl = numeroControl;
    }

    public estudiante(String numeroControl, String nombre, int edad) {
        super(nombre, edad);
        this.numeroControl = numeroControl;
    }

    public String getNumeroControl() {
        return numeroControl;
    }

    public void setNumeroControl(String numeroControl) {
        this.numeroControl = numeroControl;
    }

}

class Persona {

    //ATRIBUTOS
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
