package TestUtils;

import java.io.*;
import java.util.List;

public class AUX_CLS {
    //    txt spremanje i citanje
    public static void readAndPrintTxtFile(String filePath) {
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(filePath));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void saveToTxtFile(String content, String filePath) {
        BufferedWriter writer = null;
        try {
            writer = new BufferedWriter(new FileWriter(filePath));
            writer.write(content);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (writer != null) {
                    writer.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

//    serijalizacija

//    citanje objekta iz datoteke
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

//    spremanje objekta u datoteku
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

//    append na txt datoteku!
    public static void saveAnotherToTxtFile(String content, String filePath) {
        BufferedWriter writer = null;
        try {
            writer = new BufferedWriter(new FileWriter(filePath, true)); // true za append mod
            writer.write(content);
            writer.newLine(); // Dodavanje nove linije nakon sadržaja
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (writer != null) {
                    writer.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

//    todo: csv file!!!

}
