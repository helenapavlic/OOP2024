package pckg_vj_7;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class TestVehicles {
    private static String[] vehicles = {"car", "helicopter", "electronic bike", "truck", "motorcycle", "carriage"};

    public static void main(String[] args) {
        LinkedList<String> vehs = new LinkedList<>();
//      u vehs se dodaju elementi vehicles -> moraju biti istog tipa
        Collections.addAll(vehs, vehicles);
        printList(vehs);
        Iterator<String> iterator = vehs.listIterator();
        printList(iterator);
        System.out.println(vehs);
    }

    private static void printList(LinkedList<String> list) {
        for (String element : list) {
            System.out.println(element);
        }
    }

    //   itarator je mehanizam koji omogucuje for each petlju
    private static void printList(Iterator<String> listIterator) {
        System.out.println("---------------------------");
        while (listIterator.hasNext()) {
            String next = listIterator.next();
            if (next.equals("carriage")) {
                listIterator.remove();
                System.out.println("removed carriage from list");
            }
            System.out.println(next);
        }
    }

}
