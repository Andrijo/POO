package EVA1_9_MEMORIA_3;

/**
 *
 * @author Andy Espino
 */
public class EVA1_9_MEMORIA_3_HEAP {

    public static void main(String[] args) {
        int i = 5; //4 bytes
        Prueba obj1 = new Prueba();
        System.out.println(obj1);
        System.out.println(obj1.valor);
        Prueba obj2 = new Prueba();
        System.out.println(obj2);
        System.out.println(obj2.valor);
        obj2 = null; //Elimino la referencia, el garbage collector lo elimina
        //Cuando los objetos no son usados se le llama "fuga de memoria" --> "memory leak"
        System.out.println(obj2.valor);
        
    }
}

class Prueba {
    int valor = 100;
}
