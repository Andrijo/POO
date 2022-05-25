package EVA3_4_NULL_POINTER_EXCEPTION;

/**
 *
 * @author Andrijo
 */
public class EVA3_4_NULL_POINTER_EXCEPTION {

    public static void main(String[] args) {
        Persona people = null;

    }
    public static void imprimirDatos(Persona people){
        moreComplicated(people);
        System.out.println("Fin de imprenta");
    }
    
    public static void moreComplicated(Persona people){
        System.out.println("Nombre: " + people.getNombre());
        System.out.println("Fin del more complicated");
    }
}

class Persona {

    //Atributos
    private String nombre;

    public Persona() {
    }

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
