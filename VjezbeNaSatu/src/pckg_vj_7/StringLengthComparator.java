package pckg_vj_7;

import java.util.Comparator;

public class StringLengthComparator implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        Integer l1 = o1.length();
        Integer l2 = o2.length();
        return l1.compareTo(l2);
    }
}
