/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EVA2_17_POLIMORFISMO_INT;

/**
 *
 * @author User
 */
public class Prueba implements Mensajes {

    @Override
    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }

    public void otroMétodo() {
        System.out.println("Método adicional.");
    }
}
