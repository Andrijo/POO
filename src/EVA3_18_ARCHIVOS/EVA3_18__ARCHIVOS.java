/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EVA3_18_ARCHIVOS;

import java.io.FileInputStream;

/**
 *
 * @author Andrijo
 */
public class EVA3_18_ARCHIVOS {

    public static void main(String[] args) {
        try {
            FileInputStream momento = new FileInputStream("C:/Archivo/Momento.txt");
            int caracter = momento.read();
            while (caracter != -1) {
                System.out.print((char) momento.read());
                caracter = momento.read();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
