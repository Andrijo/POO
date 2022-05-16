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
public class Triángulo extends Figura {

    //Atributos
    private double base;
    private double altura;

    //Metodos
    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    //Constructores
    public Triángulo() {
    }

    public Triángulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        double area;
        area = (base * altura) / 2;
        return area;
    }
}
