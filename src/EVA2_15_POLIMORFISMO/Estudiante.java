/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EVA2_15_POLIMORFISMO;

/**
 *
 * @author User
 */
public class Estudiante extends Persona {

    //Atributos
    private String numeroControl;

    //Constructores
    public Estudiante() {
        super();
    }

    public Estudiante(String numeroControl, String nombre, int edad) {
        super(nombre, edad);
        this.numeroControl = numeroControl;
    }

    //Métodos
    public String getNumeroControl() {
        return numeroControl;
    }

    public void setNumeroControl(String numeroControl) {
        this.numeroControl = numeroControl;
    }
}
