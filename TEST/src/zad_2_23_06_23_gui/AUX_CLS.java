package zad_2_23_06_23_gui;

import java.io.*;

public class AUX_CLS {

    public static <T> T readObjectFromFile(String filePath) {
        T object = null;
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(new File(filePath)))) {
            object = (T) ois.readObject();
            System.out.println("object successfully read: " + object);

        } catch (FileNotFoundException e) {
            System.out.println("file not found: " + filePath);
        } catch (ClassNotFoundException e) {
            System.out.println("class not found");
        } catch (IOException e) {
            System.out.println("error");
        }
        return object;
    }

    public static <T> void saveObjectToFile(String filePath, T object) {
//        try with resources
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(new File(filePath)))) {
            oos.writeObject(object);
            System.out.println("Object written to file");
        } catch (FileNotFoundException e) {
            System.out.println("file not found: " + filePath);
        } catch (IOException e) {
            System.out.println("error");
        }
    }
}
