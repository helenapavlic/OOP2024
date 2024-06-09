package zad_1_07_07_23_gui;

import java.io.*;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;

public class AUX_CLS {
    public  static int generateRandomInt(int lower, int upper) {
        return ThreadLocalRandom.current().nextInt(lower,upper);
    }

//    serializacija
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


//    KEY VALUE DODAVANJE PODATAKA U LISTU
    public static void addCourseToList(Student student, String course){
        if (student.getCourses().contains(course)){
            System.out.println("course is already in list");
        } else {
            ArrayList<String> courses = student.getCourses();
            courses.add(course);
            System.out.println("added course: " + course);
        }
    }

}
