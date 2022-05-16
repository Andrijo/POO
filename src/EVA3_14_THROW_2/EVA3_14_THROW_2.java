/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EVA3_14_THROW_2;

/**
 *
 * @author User
 */
public class EVA3_14_THROW_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persona people = new Persona();
        people.setNombre("John Constantine");
        try {
            people.setEdad(150);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        try {
            Persona person = new Persona("Billy Batson", 75);
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }

}
