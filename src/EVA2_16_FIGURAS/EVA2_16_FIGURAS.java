/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EVA2_16_FIGURAS;

/**
 *
 * @author User
 */
public class EVA2_16_FIGURAS {

    public static void main(String[] args) {
        //Objetos
        Triángulo trian = new Triángulo(10, 15);
        Círculo circu = new Círculo(20);
        Rectángulo recta = new Rectángulo(20, 25);
        //system.out.println("Area: " + trian.calcularArea());
        //Verificar poliformismo con IS-A
        //Figura prueba = trian; //IS-A
        //Triangulo trian2 = new Figura(); //IS-A

        imprimirArea(circu);
        imprimirArea(trian);
        imprimirArea(recta);

        claseObject(trian);
    }

    public static void imprimirArea(Figura f) {
        System.out.println("Area: " + f.calcularArea());
        //RESTAURAR EL OBJETO
        //CONVERTIR UN TIPO DE DATO A OTRO --> CASTING
        if (f instanceof Triángulo) {
            System.out.println(f.getClass());
            Triángulo trian = (Triángulo) f; //Convierto figura en un triangulo
        }
    }

    public static void claseObject(Object o) {
        System.out.println(o.getClass());
    }

}
