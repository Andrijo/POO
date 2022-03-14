package EVA1_8_MEMORIA_2;

/**
 *
 * @author Andy Espino
 */
public class EVA1_8_MEMORIA_2_STACK {

    public static void main(String[] args) {
        System.out.println("Inicia Main");
        A();
        System.out.println("Termina Main");
    }

    public static void A() {
        System.out.println("Inicia A");
        B();
        System.out.println("Termina A");
    }

    public static void B() {
        System.out.println("Inicia B");
        System.out.println("Termina B");
    }
}
