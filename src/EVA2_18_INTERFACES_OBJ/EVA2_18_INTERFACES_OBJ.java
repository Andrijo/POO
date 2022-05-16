/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EVA2_18_INTERFACES_OBJ;

/**
 *
 * @author User
 */
public class EVA2_18_INTERFACES_OBJ {

    public static void main(String[] args) {
        Persona perso = new Persona();
        perso.setNombre("Andidi");

        Mensajes mensaje = perso;
        mensaje.mostrarMensaje();
    }
}

interface Mensajes {

    public void mostrarMensaje();
}

class Persona implements Mensajes {

    private String nombre;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void mostrarMensaje() {
        System.out.println(nombre);
    }

}
