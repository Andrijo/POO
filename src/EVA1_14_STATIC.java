package EVA1_14_STATIC;

/**
 *
 * @author user
 */
public class EVA1_14_STATIC {

    public static void main(String[] args) {
        //Instanciar clase
        /*FormulasMatematicas misFor = new FormulasMatematicas();
        double area = misFor.calcularAreaCirculo(100);
        System.out.println("Area del circulo: " + area);*/
        double area = FormulasMatematicas.calcularAreaCirculo(100);
        System.out.println("Area del circulo: " + area);
        double areaT = FormulasMatematicas.calcularAreaTriangulo(100, 50);
        System.out.println("Area del triangulo: " + areaT);
        FormulasMatematicas miObj = new FormulasMatematicas();
        miObj.imprimirMensaje();
    }
}

class FormulasMatematicas {

    static int valor = 100;

    //Area de un circulo:
    public static double calcularAreaCirculo(double radio) {
        double area;

        area = 3.1416 * radio * radio;

        return area;
    }

    //Area de un triangulo
    public static double calcularAreaTriangulo(double base, double altura) {
        double areaT;

        areaT = (base * altura) / 2.0;
        return areaT;
    }

    public void imprimirMensaje() {
        System.out.println("Hola mundo" + calcularAreaCirculo(100));
    }
}
