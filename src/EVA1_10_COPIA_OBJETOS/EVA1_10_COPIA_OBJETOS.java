package EVA1_10_COPIA_OBJETOS;

/**
 *
 * @author Andy Espino
 */
public class EVA1_10_COPIA_OBJETOS {

    public static void main(String[] args) {
        Prueba obj = new Prueba();
        System.out.println("Dirección: " + obj);
        obj.x = 100;
        System.out.println("Valor de X: " + obj.x);
        Prueba respaldo = obj;
        respaldo.x = obj.x;
        System.out.println("Valor de X en respaldo: " + respaldo.x);
        //Modifico el respaldo
        respaldo.x = 0;
        System.out.println("Valor de X en objeto 1: " + obj.x);
        System.out.println("Valor de X en respaldo: " + respaldo.x);
        //Imprimir direcciones de memoria
        System.out.println("Dirección (Objeto 1): " + obj);
        System.out.println("Dirección (Respaldo): " + respaldo);
        if (obj == respaldo) {
            System.out.println("Son el mismo objeto");
        } else {
            System.out.println("Son distintos objetos");
        }
    }
}

class Prueba {

    public int x;
}
