/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EVA2_19_CLASES_ANONIMAS;

/**
 *
 * @author User
 */
public class EVA2_19_CLASES_ANONIMAS {

    public static void main(String[] args) {
        // TODO code application logic here
        Mensajes mensaje = new Mensajes() {

            @Override
            public void mostrarMensaje() {
                System.out.println("Hola mundillo");
            }
        };
        mensaje.mostrarMensaje();
    }
}

interface Mensajes {

    public void mostrarMensaje();
}
