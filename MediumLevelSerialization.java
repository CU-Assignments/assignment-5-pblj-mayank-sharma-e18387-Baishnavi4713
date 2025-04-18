// MediumLevelSerialization.java
import java.io.*;

public class MediumLevelSerialization {
    public static void main(String[] args) {
        Student s = new Student(101, "John Doe", 3.8);

        // Serialize
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("student.ser"))) {
            out.writeObject(s);
            System.out.println("Student details saved successfully!");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Deserialize
        System.out.println("Reading from file...");
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("student.ser"))) {
            Student savedStudent = (Student) in.readObject();
            savedStudent.display();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
