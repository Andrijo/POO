/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EVA3_18_ARCHIVOS;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 * @author Andrijo
 */
public class EVA3_18_ARCHIVOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //TODO code application logic here
        //Ruta:
        //FileInputStream
        try {
            FileInputStream momento = new FileInputStream("C:/Archivos/momento.txt");
            /*do {
             System.out.println("Momento: " + momento.read());
             } while (momento.read() != -1);
             */
            int caracter = momento.read();
            while (caracter != -1) {
                System.out.print((char) caracter);
                caracter = momento.read();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

}
