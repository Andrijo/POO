package EVA1_2_CLASE_PERSONA;
/**
 *
 * @author Andy
 */
public class EVA1_2_CLASE_PERSONA { //DECLARACION
    //IMPLEMENTACION{}

    public static void main(String[] args) {
        //implementación{}
        System.out.println("Hola mundo!!");
        Persona estudiante = new Persona(); //DECLARACION DE UN IDENTIFICADOR (OBJETO) TIPO PERSONA
        estudiante.id = "00112233";
        estudiante.nombre = "John Cena";
        estudiante.edad = 12;
        estudiante.imprimirDatos();
        //CONCATENACION -> PEGAR CADENAS DE TEXTO
        // "    " + ENTERO/BOOLEANO/STRING/DOUBLE/ETC  --> CADENAS DE TEXTO
        
        Persona estudiante2 = new Persona();
        estudiante2.id = "11223344";
        estudiante2.nombre = "Dave Bautista";
        estudiante2.edad = 13;
        estudiante2.imprimirDatos();
        
        Persona estudiante3 = new Persona();
        estudiante3.id = "45658545";
        estudiante3.nombre = "Kofi Kingston";
        estudiante3.edad = 13;
        estudiante3.calcularAñoNacimiento();
        estudiante3.imprimirDatos();
    }
}

class Persona{ //IMPLEMENTACION
    //ATRIBUTOS DE LA CLASE
    String id;
    String nombre;
    int edad;
    
    //COMPORTAMIENTO
    //METODO IMPRIMIR DATOS --> METODO/FUNCION --> F(3) = X+1
    //VALOR DE REOTRNO + NOMBRE DE LA FUNCION ( ARGUMENTOS ) ;
    void imprimirDatos(){//NO REGRESA VALOR, EL NOMBRE ES "IMPRIMIRDATOS" (NO RECIBE VALORES)
        System.out.println("\nEl nombre es: " + nombre);
        System.out.println("Su id es: " + id);
        System.out.println("La edad es: " + edad);
        System.out.println("El año de nacimiento es " + calcularAñoNacimiento());
    }
    
    //CALCULAR AñO DE NACIMIENTO
    int calcularAñoNacimiento(){//DECLARACION
        int añoNac = 2022 - edad;
        return añoNac;
    }
}

/*
Persona:
//DATOS --> ATRIBUTOS DE LA CLASE
ID: cadena
Nombre: cadena
Edad: entero
Año de Nacimiento: entero
*/

