package Collection_Framework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LearnCustomCollectionClass {
    public static void main(String[] args) {
        
        List<Student> list = new ArrayList<>();

        list.add(new Student("Kanwal", 2));
        list.add(new Student("Waqar", 1));
        list.add(new Student("Muzammil", 3));
        list.add(new Student("Fari", 4));

        // Student s1 = new Student("Ali", 1);
        // Student s2 = new Student("Shahid", 2);

        // System.out.println( s1.compareTo(s2) );

        System.out.println( list );

        // Collections.sort(list);
        
        // Custom Sorting
        Collections.sort(list, new Comparator<Student>(){
            @Override
            public int compare(Student o1, Student o2) {
                return o1.name.compareTo(o2.name);
            }
        });
        
        System.out.println( list );

    }
}
