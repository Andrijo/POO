/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EVA2_10_METODOS_ABSTRACTOS;

/**
 *
 * @author User
 */
public class EVA2_10_METODOS_ABSTRACTOS {

    public static void main(String[] args) {

    }
}

class ImplementoAbstracto extends ClaseAbstracta {

    @Override
    public void MetodoAbstracto() {

    }

}

abstract class ClaseAbstracta {

    public void ModoIMplementado() {
        System.out.println("Metodo Implementado");

    }

    public abstract void MetodoAbstracto();

}
