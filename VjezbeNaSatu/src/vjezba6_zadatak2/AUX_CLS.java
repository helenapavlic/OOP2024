package vjezba6_zadatak2;

import java.util.HashMap;
import java.util.Map;

public class AUX_CLS {
    public static void addNewUser(User user, HashMap<Integer, String> users) {
        if (users.containsKey(user.getUserId())) {
            System.out.println("user is already added");
        } else {
            users.put(user.getUserId(), user.getUserName());
            System.out.println("New user successfully added!");
        }
    }

//    parametrization
    public static <K,V> void listAllMapElements(HashMap<K,V> map) {
        System.out.println("-----------------------------------------");
        for (K key : map.keySet()) {
            System.out.println("id: " + key + " username: " + map.get(key));
        }
    }

    public static <K,V> void listAllMapElementsNew(HashMap<K,V> map){
        System.out.println("-----------------------------------------");
        for (Map.Entry<K, V> entrySet : map.entrySet()){
            System.out.println("Key: " + entrySet.getKey() + " value: " + entrySet.getValue());
        }
    }
}
