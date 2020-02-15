package Serialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializeTest {

    public static void main(String[] args) throws FileNotFoundException {
        Person person = new Person("Jan", "Kowalski", 24);

        try {
            FileOutputStream fileOutputStream =
                    new FileOutputStream("PersonSerialized.data");
            ObjectOutputStream cos = new ObjectOutputStream(fileOutputStream);
            cos.writeObject(person);
            cos.close();
            fileOutputStream.close();
            System.out.println(person);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
