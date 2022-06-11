package EVA3_15_MEJORA_THROW_2;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Andrijo
 */
public class EVA3_15_MEJORA_THROW_2 {

    public static void main(String[] args) {
        Scanner momento = new Scanner(System.in);
        Persona person = new Persona();
        int ag;
        boolean wrongData = true;
        do {
            try {
                System.out.println("Ingrese una edad: ");
                ag = momento.nextInt();
                person.setAge(age);
                wrongData = false;
                System.out.println("La edad es: " + person.getAge());
            } catch (Exception e) {
                System.out.println("El rango de edad es incorrecto.");
            }
        } while (wrongData);

    }
}

class Persona {

    //Atributos
    private String name;
    private int age;

    //Constructores
    public Persona() {
    }

    public Persona(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //Métodos
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws Exception {
        if ((age >= 0) && (age <= 100)) {
            this.age = age;
        } else {
            throw new Exception("El rango de edad es incorrecto.");
        }
    }

}
