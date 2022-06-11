package EVA3_22_SERIALIZABLE_ARREGLOS;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Andrijo
 */
public class EVA3_22_SERIALIZABLE_ARREGLOS {

    public static void main(String[] args) {
        //Collections. <Tipos de datos genericos>
        //Java --> Listas, arreglos, etc: 0 -- N -- 1
        ArrayList<Person> myPersonList = new ArrayList();
        myPersonList.add(new Person("Julie", "Delpy"));
        myPersonList.add(new Person("Emma", "Stone"));
        myPersonList.add(new Person("Jesse", "Eisenberg"));
        myPersonList.add(new Person("Adele", "Haenel"));
        writeObj(myPersonList);
        readObj(myPersonList);
    }

    public static void writeObj(Object obj) {
        try {
            FileOutputStream openFile = new FileOutputStream("C:/Archivo/Momentum.obj");
            ObjectOutputStream saveObj = new ObjectOutputStream(openFile);
            saveObj.writeObject(obj);
            saveObj.flush();
            saveObj.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(EVA3_21_SERIALIZABLE_ARREGLOS.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(EVA3_21_SERIALIZABLE_ARREGLOS.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void readObj(Object obj) {
        try {
            FileInputStream openFile = new FileInputStream("C:/Archivo/Momentum.obj");
            ObjectInputStream readObj = new ObjectInputStream(openFile);
            ArrayList<Person> myPersonList = (ArrayList<Person>) readObj.readObject();
            for (int i = 0; i < myPersonList.size(); i++) {
                Person person = myPersonList.get(i);
                System.out.println("Nombre: " + person.getName() + " " + person.getLastName());
                readObj.close();
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(EVA3_21_SERIALIZABLE_ARREGLOS.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException | ClassNotFoundException ex) {
            Logger.getLogger(EVA3_21_SERIALIZABLE_ARREGLOS.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

class Person implements Serializable {

    private String name;
    private String lastName;

    public Person() {
    }

    public Person(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

}
