/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EVA2_3_HERENCIA_3;

/**
 *
 * @author Andrijo
 */
public class EVA2_3_HERENCIA_3 {

    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.mover();
        Vertebrado vertebrate = new Vertebrado();
        vertebrate.tenerEsqueleto();
        Mamifero mammal = new Mamifero();
        mammal.tenerPelo();
        Primate primate = new Primate();
        primate.agarrarObjetos();
        Humano human = new Humano();
        human.pensar();
    }
}

class Humano extends Primate {

    public Humano() {
        System.out.println("Humano");
    }

    public void pensar() {
        System.out.println("Pensar");
    }
}

class Primate extends Mamifero {

    public Primate() {
        System.out.println("Primate");
    }

    public void agarrarObjetos() {
        System.out.println("Agarra objetos");
    }
}

class Mamifero extends Vertebrado {

    public Mamifero() {
        System.out.println("Mamifero");
    }

    public void tenerPelo() {
        System.out.println("Mamifero: tiene pelo");
    }
}

class Vertebrado extends Animal {

    public Vertebrado() {
        super();
        System.out.println("Vertebrado");
    }

    public void tenerEsqueleto() {
        System.out.println("Vertebrado: tiene esqueleto");
    }
}

class Animal {

    public Animal() {
        System.out.println("Animal");
    }

    public void mover() {
        System.out.println("Animal: movimiento");
    }

}
