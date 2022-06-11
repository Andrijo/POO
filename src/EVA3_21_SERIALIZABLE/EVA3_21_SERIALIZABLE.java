package EVA3_21_SERIALIZABLE;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Andrijo
 */
public class EVA3_21_SERIALIZABLE {

    public static void main(String[] args) {
        //Archivos binarios y de texto.
        //Especificar que objetos (clases) son serializables.
        //Debemos hacer que la clase implemente la interfaz serializable.
        Persona person = new Persona("Andy", 19);
        writeObj(person);
        readObj(person);
    }

    //Guardar objetos
    public static void writeObj(Object obj) {
        try {
            FileOutputStream openFile = new FileOutputStream("C:/Archivo/Momentum.obj");
            ObjectOutputStream saveObj = new ObjectOutputStream(openFile);
            saveObj.writeObject(obj);
            saveObj.flush();
            saveObj.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(EVA3_21_SERIALIZABLE.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(EVA3_21_SERIALIZABLE.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    //Leer objetos
    public static void readObj(Object obj) {
        try {
            FileInputStream openFile = new FileInputStream("C:/Archivo/Momentum.obj");
            ObjectInputStream readObj = new ObjectInputStream(openFile);
            Persona person = (Persona) readObj.readObject();
            System.out.println("Nombre: " + person.getName() + " " + person.getAge());
            readObj.close();
        } catch (IOException | ClassNotFoundException ex) {
            Logger.getLogger(EVA3_21_SERIALIZABLE.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

class Persona implements Serializable {

    //Atributos
    private String name;
    private int age;

    public Persona() {
    }

    public Persona(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
