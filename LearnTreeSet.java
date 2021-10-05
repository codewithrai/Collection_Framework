package Collection_Framework;

import java.util.Set;
import java.util.TreeSet;

public class LearnTreeSet {
    public static void main(String[] args) {
        
        // Maintain Ordering
        // Sorted elements
        // Duplicate Values not allowed
        Set<Integer> set = new TreeSet<>();

        set.add(32);
        set.add(2);
        set.add(54);
        set.add(21);
        set.add(65);
        set.add(65);

        System.out.println( set );
        set.remove(54);
        System.out.println( set );
        System.out.println( set.contains(100) );
        System.out.println( set.isEmpty() );
        System.out.println( set.size() );
        set.clear();
        System.out.println( set );

    }
}
