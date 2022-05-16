/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EVA2_5_INTERFACES;

/**
 *
 * @author User
 */
public class EVA2_5_INTERFACES {

    public static void main(String[] args) {
        Persona perso = new Persona();
        perso.setNombre("Andy");
        perso.setEdad(19);
        perso.imprimirDatos();

        Vehiculo vehi = new Vehiculo();
        vehi.setMarca("Ford");
        vehi.setModelo("Mustang");
        vehi.imprimirDatos();
        vehi.mostrarMensaje();
    }
}

class Persona implements muestraDatos {

    //ATRIBUTOS
    private String nombre;
    private int edad;

    public Persona() {
    }

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
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

    @Override
    public void imprimirDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
    }

}

class Vehiculo implements muestraDatos, mensaje {

    //ATRIBUTOS
    private String marca;
    private String modelo;

    public Vehiculo() {
    }

    public Vehiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public void imprimirDatos() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
    }

    @Override
    public void mostrarMensaje() {
        System.out.println("Hola mundo.");
    }

}

interface muestraDatos {

    //SOLO ACEPTAN METODOS PUBLICOS
    //SOLO SE ACEPTAN DECLARACIONES DE METODOS
    public void imprimirDatos();
}

interface mensaje {

    public void mostrarMensaje();
}
