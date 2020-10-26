package Serialization;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;


public class WriteObject {
    public static void main(String[] args) {
        try (
                ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("object.txt"))) {
            Person person = new Person("9long", 23);
            oos.writeObject(person);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}