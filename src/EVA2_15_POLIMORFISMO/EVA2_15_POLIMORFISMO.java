/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EVA2_15_POLIMORFISMO;

/**
 *
 * @author User
 */
public class EVA2_15_POLIMORFISMO {
    public static void main(String[] args) {
        Persona persona = new Persona("Juan", 30);
        Estudiante estudiante = new Estudiante("001122", "Maria", 25);
        Docente docente = new Docente("036","Pedro",50);
        
        Persona persoEstu = estudiante;
        //Estudiante estuPerso = persona;
    }
}
