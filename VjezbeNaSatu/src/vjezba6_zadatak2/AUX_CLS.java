package vjezba6_zadatak2;

import java.util.Map;
import java.util.Set;
import java.util.concurrent.ThreadLocalRandom;

public class AUX_CLS {

    private static final int MAXI = 100;
    public static void addNewUser(User user, Map<Integer, String> users) {
        if (users.containsKey(user.getUserId())) {
            System.out.println("user is already added");
        } else {
            users.put(user.getUserId(), user.getUserName());
            System.out.println("New user successfully added!");
        }
    }

    //    parametrization
    public static <K, V> void listAllMapElements(Map<K, V> map) {
        System.out.println("-----------------------------------------");
        for (K key : map.keySet()) {
            System.out.println(key + " | " + map.get(key));
        }
    }

    public static <K, V> void listAllMapElementsNew(Map<K, V> map) {
        System.out.println("-----------------------------------------");
        for (Map.Entry<K, V> entrySet : map.entrySet()) {
            System.out.println("Key: " + entrySet.getKey() + " value: " + entrySet.getValue());
        }
    }

    public static <E> void addElementToSet(E element, Set<E> elements) {
//        set cant have duplicates
        if (elements.add(element)) {
            System.out.println("element added!");
        } else {
            System.out.println("element is already in set!");
        }
    }


    public static <E> void printElementsFromSet(Set<E> elements) {
        System.out.println("------------------- " + elements.getClass().getSimpleName() + " ------------------");
        for (E element : elements) {
            System.out.println(element);
        }
    }

    public static <E> void removeElementFromSet(Set<E> elements, E elementToRemove) {
        System.out.println("-----------------------------------------------------");
        if (elements.remove(elementToRemove)) {
            System.out.println("removed element: " + elementToRemove);
        } else {
            System.out.println("element is not in set");
        }
    }

    public static void addRobotToMap(Map<Robot, Integer> robots, Robot robot) {
        if (robots.containsKey(robot)){
            System.out.println("robot is already in map");
        } else {
            robots.put(robot, randomIntValue());
            System.out.println("new robot added: " + robot.getDescription());
        }
    }

    private static int randomIntValue() {
        return ThreadLocalRandom.current().nextInt(MAXI);
    }

}
