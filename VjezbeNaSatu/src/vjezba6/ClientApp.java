package vjezba6;

import java.util.HashMap;
import java.util.HashSet;

public class ClientApp {
    public static void main(String[] args) {
//        HashMap<Integer, String> users = new HashMap<>();
//
//        User user1 = new User("user1", "pass1", 15);
//        User user2 = new User("user2", "pass2", 100);
//        User user3 = new User("user3", "pass3", 345);
//        AUX_CLS.addNewUser(user1, users);
//        AUX_CLS.addNewUser(user1, users);
//        AUX_CLS.addNewUser(user2, users);
//        AUX_CLS.addNewUser(user3, users);
//        AUX_CLS.listAllMapElements(users);
//        AUX_CLS.listAllMapElementsNew(users);
//
//        HashSet<String> hashSet = new HashSet<>();
//        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
//        TreeSet<String> treeSet = new TreeSet<>();
//
//        AUX_CLS.addElementToSet("otvoreni", hashSet);
//        AUX_CLS.addElementToSet("kod", hashSet);
//        AUX_CLS.addElementToSet("linux", hashSet);
//        AUX_CLS.addElementToSet("kripto", hashSet);
//
//        AUX_CLS.addElementToSet("otvoreni", linkedHashSet);
//        AUX_CLS.addElementToSet("kod", linkedHashSet);
//        AUX_CLS.addElementToSet("linux", linkedHashSet);
//        AUX_CLS.addElementToSet("kripto", linkedHashSet);
//
//        AUX_CLS.addElementToSet("otvoreni", treeSet);
//        AUX_CLS.addElementToSet("kod", treeSet);
//        AUX_CLS.addElementToSet("linux", treeSet);
//        AUX_CLS.addElementToSet("kripto", treeSet);
//        AUX_CLS.addElementToSet("kripto", treeSet);
//
//        AUX_CLS.printElementsFromSet(hashSet);
//        AUX_CLS.printElementsFromSet(treeSet);
//        AUX_CLS.printElementsFromSet(linkedHashSet);
//
//        AUX_CLS.removeElementFromSet(treeSet, "kripto");
//        AUX_CLS.removeElementFromSet(treeSet, "kripto");
//        AUX_CLS.removeElementFromSet(treeSet, "jhasfk");
//        AUX_CLS.printElementsFromSet(treeSet);

        HashSet<Robot> robots = new HashSet<>();

        AUX_CLS.addElementToSet(new Robot("flying robot"), robots);
        AUX_CLS.addElementToSet(new Robot("weird robot"), robots);
        AUX_CLS.addElementToSet(new Robot("cleaning robot"), robots);
        AUX_CLS.addElementToSet(new Robot("thinking robot"), robots);
        AUX_CLS.printElementsFromSet(robots);

        HashMap<Robot, Integer> robotsHashMap = new HashMap<>();
        AUX_CLS.addRobotToMap(robotsHashMap, new Robot("flying robot"), 30);
        AUX_CLS.addRobotToMap(robotsHashMap, new Robot("weird robot"), 29);
        AUX_CLS.addRobotToMap(robotsHashMap, new Robot("cleaning robot"), 90);
        AUX_CLS.addRobotToMap(robotsHashMap, new Robot("thinking robot"), 87);
        AUX_CLS.listAllMapElements(robotsHashMap);


    }
}
