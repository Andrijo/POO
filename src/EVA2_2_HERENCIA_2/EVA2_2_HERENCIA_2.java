/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EVA2_2_HERENCIA_2;

/**
 *
 * @author User
 */
public class EVA2_2_HERENCIA_2 {

    public static void main(String[] args) {
        Dirección address = new Dirección("Misión", "Chihuahua", "Oaxaca", "31520", "Chiapas", "6561485555", 19);
        Estudiante student = new Estudiante("LC250052M", "Andy", 19, address);
        student.imprimirDatos();
    }
}

class Persona {

    //Atributos
    private String nombre;
    private int edad;

    //Constructores
    public Persona() {
        this.nombre = "";
        this.edad = 0;
    }

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    //Métodos
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

    public void imprimirDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
    }

}

class Estudiante extends Persona {

    //Atributos
    private String numerodeControl;
    private Dirección dirección;

    //Constructores
    public Estudiante() {
        super();
        this.numerodeControl = "";
        dirección = new Dirección();
    }

    //Métodos
    public Estudiante(String numerodeControl, String nombre, int edad, Dirección dirección) {
        super(nombre, edad);
        this.numerodeControl = numerodeControl;
        this.dirección = dirección;
    }

    public String getNumerodeControl() {
        return numerodeControl;
    }

    public void setNumerodeControl(String numerodeControl) {
        this.numerodeControl = numerodeControl;
    }

    @Override
    public void imprimirDatos() {
        super.imprimirDatos();
        System.out.println("Número de control: " + numerodeControl);
        dirección.imprimirDirección();
    }

}

class Dirección {

    //ATRIBUTOS
    private String calle;
    private String ciudad;
    private String colonia;
    private String códigoPostal;
    private String estado;
    private String teléfono;
    private int número;

    //CONSTRUCTORES
    public Dirección() {
        this.calle = "";
        this.ciudad = "";
        this.colonia = "";
        this.códigoPostal = "";
        this.estado = "";
        this.teléfono = "";
        this.número = 0;
    }

    public Dirección(String calle, String colonia, String códigoPostal, String ciudad, String estado, String teléfono, int número) {
        this.calle = calle;
        this.colonia = colonia;
        this.códigoPostal = códigoPostal;
        this.ciudad = ciudad;
        this.estado = estado;
        this.teléfono = teléfono;
        this.número = número;
    }

    //METODOS
    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getColonia() {
        return colonia;
    }

    public void setColonia(String colonia) {
        this.colonia = colonia;
    }

    public String getCódigoPostal() {
        return códigoPostal;
    }

    public void setCódigoPostal(String códigoPostal) {
        this.códigoPostal = códigoPostal;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getTeléfono() {
        return teléfono;
    }

    public void setTeléfono(String teléfono) {
        this.teléfono = teléfono;
    }

    public int getNúmero() {
        return número;
    }

    public void setNúmero(int número) {
        this.número = número;
    }

    public void imprimirDirección() {
        System.out.println("Calle: " + calle);
        System.out.println("Ciudad: " + ciudad);
        System.out.println("Colonia: " + colonia);
        System.out.println("Código postal: " + códigoPostal);
        System.out.println("Estado: " + estado);
        System.out.println("Número: " + número);
        System.out.println("Teléfono: " + teléfono);
    }
}
