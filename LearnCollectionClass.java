package Collection_Framework;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Comparator;

public class LearnCollectionClass {
    public static void main(String[] args) {
        
        List<Integer> list = new ArrayList<>();

        list.add(34);
        list.add(12);
        list.add(14);
        list.add(41);
        list.add(49);
        list.add(56);

        // System.out.println( "Min element " + Collections.min(list) );
        // System.out.println( "Max element " + Collections.max(list) );
        // System.out.println( "Frquemcy of 9 is " + Collections.frequency(list, 12) );

        Collections.sort(list);
        Collections.sort(list, Comparator.reverseOrder());

        System.out.println( list );
    }
}
