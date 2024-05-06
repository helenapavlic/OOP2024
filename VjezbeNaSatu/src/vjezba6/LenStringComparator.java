package vjezba6;

import java.util.Comparator;

public class LenStringComparator implements Comparator<String> {

    @Override
    public int compare(String s1, String s2) {
        int finalInt;
        if (s1.length() > s2.length()){
            finalInt = 1;
        } else if(s1.length() < s2.length()){
            finalInt = -1;
        } else {
            finalInt = 0;
        }
        return finalInt;
    }
}
