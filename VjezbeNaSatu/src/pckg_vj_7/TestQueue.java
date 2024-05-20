package pckg_vj_7;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadLocalRandom;

public class TestQueue {
    // flag ne treba bit argument funkcije, bolja praksa je da bude jer flag moze doci iz bil kojeg dijela programa
//    flag simbolizira on ili off, nor salter u banci radi ili ne
//    ako salter ne radi flag je 0, brojevi se ne mogu procesirat i novi se ne mogu dodavat

//    realizirajte sekvencu upravlja salterom u sekvenci 1 i 0. salter radi i ne radi -> mijenjanje flaga
//    ovisno o remaminigCapacity imamo drugi red ceganja -> simulirani sa drugim sedom cekanja koji je veci od prvoga, satvlja nove ljude u queue
    private static int flag = 1;
    private static int MAXI = 100;


    public static void main(String[] args) {
        ArrayBlockingQueue<Integer> queue = new ArrayBlockingQueue<>(5);
        try {
            populateQueue(queue);
            System.out.println(queue);
            boolean processed = processQueueElement(queue);
            System.out.println(processed);
            addNewElementToQueue(-100, queue, processed);
        } catch (IllegalStateException e) {
            System.out.println("queue is full!");
        } finally {
            System.out.println(queue);
        }

    }

    //    static method overload
    private static ArrayBlockingQueue<Integer> populateQueue(int num) {
        return null;
    }

    //    ArrayBlockingQueue se ne kopira, nego se izmene radi na originalnom objektu -> passByReference
//    kopija reference se uskladi sa originalnom referencom
    private static void populateQueue(ArrayBlockingQueue<Integer> queue) {
        int populated = queue.size();
        int remainder = queue.remainingCapacity();
        int capacity = populated + remainder;
        for (int i = 0; i < capacity; i++) {
            queue.add(ThreadLocalRandom.current().nextInt(MAXI));
        }
    }

    //    bolji izlz od booleana je int remainingCapitity kako bi druga metoda znala koliko mjesta moze popunit
    private static boolean processQueueElement(ArrayBlockingQueue<Integer> queue) {
        boolean isProcessed = false;
        if (!queue.isEmpty() && flag == 1) {
            Integer element = queue.poll();
            System.out.println("processing element; " + element);
            System.out.println("remaining elements in queue: " + queue.size());
            isProcessed = true;
        } else {
            System.out.println("nothing to process");
        }
        return isProcessed;
    }

    private static void addNewElementToQueue(Integer newInt, ArrayBlockingQueue<Integer> queue, boolean isProcessed) {
        if (isProcessed) {
            queue.add(newInt);
            System.out.println("new int added");
            System.out.println(queue);
        } else {
            System.out.println("unable to add new element");
            System.out.println(queue);
        }
    }
}
