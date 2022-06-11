package EVA3_17_EXCEPTION_RANGO;

/**
 *
 * @author Andrijo
 */
public class EVA3_17_EXCEPTION_RANGO {

    public static void main(String[] args) {
        try {
            Persona person = new Persona("Andy", -25);
        } catch (RangeException e) {
            e.printStackTrace();
        }
    }
}

class RangeException extends Exception {

    public RangeException() {
    }

    public RangeException(String message) {
        super(message);
    }
}

class Persona {

    private String name;
    private int age;

    public Persona() {
    }

    public Persona(String name, int age) throws RangeException {
        this.name = name;
        setAge(age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws RangeException {
        if ((age >= 0) && (age <= 100)) {
            this.age = age;
        } else {
            throw new RangeException("Introduciste una edad fuera de rango.");
        }
    }

}
