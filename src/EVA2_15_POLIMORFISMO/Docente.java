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
public class Docente extends Persona {

    //Atributos
    private String numeroRegistro;

    //Constructores
    public Docente() {
    }

    public Docente(String numeroRegistro, String nombre, int edad) {
        super(nombre, edad);
        this.numeroRegistro = numeroRegistro;
    }

    //Métodos
    public String getNumeroRegistro() {
        return numeroRegistro;
    }

    public void setNumeroRegistro(String numeroRegistro) {
        this.numeroRegistro = numeroRegistro;
    }
}
