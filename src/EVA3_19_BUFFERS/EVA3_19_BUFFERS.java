package EVA3_19_BUFFERS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Andrijo
 */
public class EVA3_19_BUFFERS {

    public static void main(String[] args) {
        //DEFINIR LA RUTA
        Path way = Paths.get("C:/Archivos/Momento.txt");
        //ABRIMOS EL ARCHIVO
        InputStream openFile;
        //LEEMOS EL ARCHIVO
        InputStreamReader readFile;
        //CONVERTIMOS BITES A CARACTERES
        BufferedReader readText;

        try {
            openFile = Files.newInputStream(way);
            readFile = new InputStreamReader(openFile);
            readText = new BufferedReader(readFile);
            String line = readText.readLine();
            while (line != null) {
                System.out.println(line);
                line = readText.readLine();
            }
            readText.close(); // Cerrar el stream
        } catch (IOException ex) {
            Logger.getLogger(EVA3_19_BUFFERS.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
