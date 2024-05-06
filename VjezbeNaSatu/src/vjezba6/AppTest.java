package vjezba6;

import java.util.ArrayList;
import java.util.Collections;

public class AppTest {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("automobil");
        list.add("kaić");
        list.add("romobil");
        list.add("bicikla");
        list.add("avion");

        System.out.println(list);
//        liste su unutar collections
//        Collections.sort(list);
//        System.out.println(list);

//        sortirati po duljini stringa (koristi komparator)
        LenStringComparator lenStringComparator = new LenStringComparator();
        Collections.sort(list,lenStringComparator);
        System.out.println(list);



    }
}
