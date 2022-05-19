/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EVA2_8_HERENCIA_INTERFACES;

/**
 *
 * @author Andrijo
 */
public class EVA2_8_HERENCIA_INTERFACES {

    public static void main(String[] args) {
        Prueba test = new Prueba();
        test.métodoA();
        test.métodoB();
    }
}

class Prueba implements B {

    @Override
    public void métodoB() {
    }

    @Override
    public void métodoA() {
    }

}
//Las interfaces son abstractas porque no tienen cuerpo
//Se pueden crear clases abstractas
//Los metodos abstractos no tienen codigo

interface A {

    public void métodoA();
}

interface B extends A {

    public void métodoB();
}
