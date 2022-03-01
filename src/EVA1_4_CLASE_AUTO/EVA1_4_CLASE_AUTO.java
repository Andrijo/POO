package EVA1_4_CLASE_AUTO;

/**
 *
 * @author Andy
 */
public class EVA1_4_CLASE_AUTO {

    public static void main(String[] args) {
        Automovil auto = new Automovil();
        auto.setMarca("Ford");
        auto.setModelo("Mustang");
        auto.setTipo("Sedán");
        auto.setColor("Negro");
        auto.setPrecio(65000);
        auto.setAño(1965);
        auto.imprimirDescripcion();
    }
}

class Automovil { //CLASES --> TIPOS DE DATOS ABSTRACTOS

    //ATRIBUTOS - PRIVADOS
    private String marca;
    private String modelo;
    private String tipo;
    private String color;
    private int año;
    private double precio;

    //COMPORTAMIENTO
    //METODOS SET
    public void setMarca(String valor) {
        marca = valor;
    }

    public String getMarca() {
        return marca;
    }

    public void setModelo(String valor) {
        modelo = valor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setTipo(String valor) {
        tipo = valor;
    }

    public String getTipo() {
        return tipo;
    }

    public void setColor(String valor) {
        color = valor;
    }

    public String getColor() {
        return color;
    }

    public void setAño(int valor) {
        año = valor;
    }

    public int getAño() {
        return año;
    }

    public void setPrecio(double valor) {
        precio = valor;
    }

    public double getPrecio() {
        return precio;
    }

    public void imprimirDescripcion() {
        System.out.println("Descripción.");
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Año: " + año);
        System.out.println("Tipo: " + tipo);
        System.out.println("Precio: " + precio);
    }
}
