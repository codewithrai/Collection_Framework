package Collection_Framework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class LearnArrayList {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(20);

        for (int i = 0; i < list.size(); i++) {
            System.out.println( list.get(i) );
        }
        System.out.println();
        Iterator<Integer> it = list.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }
        System.out.println();
        for (Integer element: list) {
            System.out.println(element);
        }

        // list.remove(2);
        // list.remove(Integer.valueOf(20));
        // System.out.println(list);
    }
}
