package Collection_Framework;

import java.util.HashSet;
import java.util.Set;

public class LearnCusomSet {
    public static void main(String[] args) {
        
        Set<Student> set = new HashSet<>();

        set.add(new Student("Waqar", 1));
        set.add(new Student("Kanwal", 2));
        set.add(new Student("Waqar", 1));
        set.add(new Student("Muzzamil", 3));

        System.out.println( set );

    }
}
