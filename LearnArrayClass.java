package Collection_Framework;

import java.util.Arrays;

public class LearnArrayClass {
    public static void main(String[] args) {
        
        // int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        // int index = Arrays.binarySearch(numbers, 4);

        // System.out.println( "The index of element 4 in the array is " + index );

        Integer[] a = { 10, 2, 5, 3, 7, 8, 20 };
        Arrays.sort(a);

        // Arrays.fill(a, 10);

        for (int i : a) {
            System.out.print( i + " " );
        }

    }
}
