package vjezba6_zadatak2;

import java.util.HashMap;

public class ClientApp {
    public static void main(String[] args) {
        HashMap<Integer,String> users = new HashMap<>();

        User user1 = new User("user1", "pass1",15);
        User user2 = new User("user2", "pass2",100);
        User user3 = new User("user3", "pass3",345);
        AUX_CLS.addNewUser(user1,users);
        AUX_CLS.addNewUser(user1,users);
        AUX_CLS.addNewUser(user2,users);
        AUX_CLS.addNewUser(user3,users);
        AUX_CLS.listAllMapElements(users);
        AUX_CLS.listAllMapElementsNew(users);
    }
}
