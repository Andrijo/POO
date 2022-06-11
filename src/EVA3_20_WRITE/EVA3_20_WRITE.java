package EVA3_20_WRITE;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Andrijo
 */
public class EVA3_20_WRITE {

    public static void main(String[] args) {
        Path way = Paths.get("C:/Archivo/Momentini.txt");
        OutputStream openFile;
        OutputStreamWriter writeFile;
        BufferedWriter writeText;
        
        try{
            openFile = Files.newOutputStream(way);
            writeFile = new OutputStreamWriter(openFile);
            writeText = new BufferedWriter(writeFile);
            writeText.write("Momentaneo");
            writeText.newLine();
            writeText.write("Momentum");
            writeText.newLine();
            writeText.flush();
            writeText.close();
            
        } catch (IOException ex) {
            Logger.getLogger(EVA3_20_WRITE.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
