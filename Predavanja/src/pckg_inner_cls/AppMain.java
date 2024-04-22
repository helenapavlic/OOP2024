package pckg_inner_cls;

import java.util.ArrayList;
import java.util.Iterator;

public class AppMain {
    public static void main(String[] args) {
        ArrayList<Integer> lst = new ArrayList<>();
        lst.add(123);
        lst.add(234);
        lst.add(1);


//        iterator -> for petlja je realizirana preko iteratora
//        prije se moralo koristiti int element (i ili k...) za prolaz kroz listu
//        mehanizam koji omogućuje iteriranje kroz slijednu strukturu na elegantan način
        Iterator<Integer> iter = lst.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }

        for (Integer element : lst) {
//            izbjegavat type casting! -> koristiti u iznimnim slučajevima
            int elementNew = element * 2;
            System.out.println(elementNew);
        }
    }

/*
    prednosti unutarnje klase:
    vidi sve privatne i ostale atribute klase
    ArrayList klasa ima privatnu klasu Itr() koja implementira sučelje Iterator
    poželjno je imati samo jednu unutarnju klasu (ako je potrebna, nikako više zbog čitljivosti koda)

    Anonimna unutarnja klasa -> bitna za gui
    klase koje se uglavnom susreću u implementaciji gui-a u javi

    lokalna klasa -> klasa koja se nalazi unutar menode vanjske klase
    unutarnja i lokalna klasa
    enkapsulirana unutar jedne metode
    uobičajeno kratke klase (anonimna i lokalna)

    apstraktna klasa
    klasa koja se nikad ne instancira objekt
    služe kako bismo kreirali konretne klase iz njih
    služe kao "blueprint" za klase koje ju nasljeđuju
    ima bar jednu apstraktnu metodu!
    atributi mogu biti protected ili public
    može imat porotected konstruktor -> služi da sa tim konstruktorom kreiramo dio klase koju ju nasljeđuje
*/

}
