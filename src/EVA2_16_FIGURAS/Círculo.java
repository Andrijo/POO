/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EVA2_16_FIGURAS;

/**
 *
 * @author User
 */
public class Círculo extends Figura {

    //Atributos
    private double radio;

    //Constructores
    public Círculo() {
    }

    public Círculo(double radio) {
        this.radio = radio;
    }

    //Metodos
    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        double area;
        area = Math.PI * Math.pow(radio, 2);
        return area;
    }
}
