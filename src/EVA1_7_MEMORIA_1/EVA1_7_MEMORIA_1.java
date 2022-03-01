package EVA1_7_MEMORIA_1;

/**
 *
 * @author Andy
 */
public class EVA1_7_MEMORIA_1 {

    public static void main(String[] args) {
        int valor = 5;
        String cade = "hola";
        Prueba obj = new Prueba();

        System.out.println("Valor: " + valor);
        System.out.println("Cadena: " + cade);
        System.out.println("Objeto: " + obj);

    }
}

class Prueba {

    public void saludar() {
        System.out.println("Hola");
    }
}
