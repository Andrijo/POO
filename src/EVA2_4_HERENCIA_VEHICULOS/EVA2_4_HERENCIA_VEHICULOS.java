/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EVA2_4_HERENCIA_VEHICULOS;

/**
 *
 * @author Andrijo
 */
public class EVA2_4_HERENCIA_VEHICULOS {

    public static void main(String[] args) {

    }
}

class Camiones extends Vehiculos {

    int numTrailas;
    String capCarga;
    String tipoCamion;

    public Camiones() {
        super();
        numTrailas = 0;
        capCarga = "";
        tipoCamion = "";
    }

    public Camiones(int numTrailas, String capCarga, String tipoCamion, int año, int numLlantas, int litMotor, int numCilindros, int pasajeros, String marca, String modelo, String tipoCombustible) {
        super(año, numLlantas, litMotor, numCilindros, pasajeros, marca, modelo, tipoCombustible);
        this.numTrailas = numTrailas;
        this.capCarga = capCarga;
        this.tipoCamion = tipoCamion;
    }
    
    @Override
    public void imprimirDatos(){
        super.imprimirDatos();
        System.out.println("Capacidad de carga: " + capCarga);
        System.out.println("Número de trailas: " + numTrailas);
        System.out.println("Tipo de camióh: " + tipoCamion);
    }
}
class Motocicletas extends Vehiculos{
    String tipoMoto;
    String cajon;
    String casco;

    public Motocicletas() {
        super();
        tipoMoto = "";
        cajon = "";
        casco = "";
    }

    public Motocicletas(String tipoMoto, String cajon, String casco, int año, int numLlantas, int litMotor, int numCilindros, int pasajeros, String marca, String modelo, String tipoCombustible) {
        super(año, numLlantas, litMotor, numCilindros, pasajeros, marca, modelo, tipoCombustible);
        this.tipoMoto = tipoMoto;
        this.cajon = cajon;
        this.casco = casco;
    }
    
    @Override
    public void imprimirDatos(){
        super.imprimirDatos();
        System.out.println("Tipo de moto: " + tipoMoto);
        System.out.println("Cuenta con caja: " + cajon);
        System.out.println("Cuenta con casco: " + casco);
    }
    
}
class Vehiculos {

    int año;
    int numLlantas;
    int litMotor;
    int numCilindros;
    int pasajeros;
    String marca;
    String modelo;
    String tipoCombustible;

    public Vehiculos() {
    }

    public Vehiculos(int año, int numLlantas, int litMotor, int numCilindros, int pasajeros, String marca, String modelo, String tipoCombustible) {
        this.año = año;
        this.numLlantas = numLlantas;
        this.litMotor = litMotor;
        this.numCilindros = numCilindros;
        this.pasajeros = pasajeros;
        this.marca = marca;
        this.modelo = modelo;
        this.tipoCombustible = tipoCombustible;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public int getNumLlantas() {
        return numLlantas;
    }

    public void setNumLlantas(int numLlantas) {
        this.numLlantas = numLlantas;
    }

    public int getLitMotor() {
        return litMotor;
    }

    public void setLitMotor(int litMotor) {
        this.litMotor = litMotor;
    }

    public int getNumCilindros() {
        return numCilindros;
    }

    public void setNumCilindros(int numCilindros) {
        this.numCilindros = numCilindros;
    }

    public int getPasajeros() {
        return pasajeros;
    }

    public void setPasajeros(int pasajeros) {
        this.pasajeros = pasajeros;
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

    public String getTipoCombustible() {
        return tipoCombustible;
    }

    public void setTipoCombustible(String tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }

    public void imprimirDatos() {
        System.out.println("Tipo de combustible: " + tipoCombustible);
        System.out.println("Número de llantas: " + numLlantas);
        System.out.println("Litros del motor: " + litMotor);
        System.out.println("Número de cilindros: " + numCilindros);
        System.out.println("Número de pasajeros: " + pasajeros);
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Año: " + año);
    }
}
