package pckg_serializable;

import java.io.*;
import java.util.ArrayList;
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

    public static <T> T readObjectFromFile(String filePath) {
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

    public static <E> List<E> readObjectsFromFile(String filePath) {
        List<E> elements = new ArrayList<>();
        try (FileInputStream fis = new FileInputStream(new File(filePath))) {
            ObjectInputStream ois = new ObjectInputStream(fis);
            System.out.println(fis.available());
            while (fis.available() > 0) {
                E someObject = (E) ois.readObject();
                elements.add(someObject);
                System.out.println("read object: " + someObject);
            }
            System.out.println("successful read data");

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return elements;
    }

//    catch (FileNotFoundException e) {
////            datoteka ne postoji ili je kriva putanja
//            throw new RuntimeException(e);
//        } catch (IOException e) {
////            javlja se kada ovu datoteku nije moguce citat
//            throw new RuntimeException(e);
//        } catch (ClassNotFoundException e) {
//            throw new RuntimeException(e);
//        }
}
