package pckg_serializable;

import java.io.*;
import java.util.List;

public class AUX_CLS {

    public static <T> void addObjectToFile(String filePath, T object) {
//        try with resources
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(new File(filePath)))) {
            oos.writeObject(object);
            System.out.println("Object written to file");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static <E> void saveMultipleObjectsToFile(String filePath, List<E> objects) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(new File(filePath)))) {
            for (E element : objects) {
                oos.writeObject(element);
                System.out.println("Object written to file" + element);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

//    public static SpaceShip readSpaceShipFromFile(String filePath) {
//        SpaceShip spaceShip = null;
//        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(new File(filePath)))) {
//            spaceShip = (SpaceShip) ois.readObject();
//            System.out.println("object successfully read: " + spaceShip);
//
//        } catch (FileNotFoundException e) {
//            System.out.println("fileNotFound");
//        } catch (ClassNotFoundException e) {
//            throw new RuntimeException(e);
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//        return spaceShip;
//    }

    public static <T> T readSpaceShipFromFile(String filePath) {
        T object = null;
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(new File(filePath)))) {
            object = (T) ois.readObject();
            System.out.println("object successfully read: " + object);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return object;
    }
}
