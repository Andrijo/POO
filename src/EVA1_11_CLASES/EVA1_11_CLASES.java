package EVA1_11_CLASES;

public class EVA1_11_CLASES {

    public static void main(String[] args) {

    }
}

class Persona {

    //ATRIBUTOS DE LA CLASE
    private String id;
    private String nombre;
    private int edad;

    public String getId() {
        return id;
    }

    //this --> este
    //apuntador --> al objeto actual
    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

}
