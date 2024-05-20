package pckg_vj_7;

import java.util.ListIterator;

public class ListProcessing implements ListIterator<String> {
    private static final String VEHICLE = "electronic bike";

    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public String next() {
        return null;
    }

    @Override
    public boolean hasPrevious() {
        return false;
    }

    @Override
    public String previous() {
        return null;
    }

    @Override
    public int nextIndex() {
        return 0;
    }

    @Override
    public int previousIndex() {
        return 0;
    }

    @Override
    public void remove() {

    }

    @Override
    public void set(String s) {

    }

    @Override
    public void add(String s) {

    }

    public void insertVehicle(String vehicle){
//        preko iteratora prolazi kroz list i ako postoji electronic bike, imamo u final stringu, nakon njega dodaje parametar string
    }
}
