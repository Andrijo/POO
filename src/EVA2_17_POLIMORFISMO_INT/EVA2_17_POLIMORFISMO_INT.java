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
public class EVA2_17_POLIMORFISMO_INT {

    public static void main(String[] args) {

        Prueba prue = new Prueba();
        //prue.mostrarMensaje("Hola mundillo");
        //prue.otroMetodo();
        mostrar(prue);
    }

    public static void mostrar(Mensajes m) {
        m.mostrarMensaje("Hola mundillo");
    }
}
