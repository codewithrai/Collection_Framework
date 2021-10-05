package Collection_Framework;

import java.util.ArrayDeque;

public class LearnArrayDeque {
    public static void main(String[] args) {

        ArrayDeque<Integer> aDeque = new ArrayDeque<>();

        aDeque.offer(23);
        aDeque.offerFirst(12);
        aDeque.offerLast(45);
        aDeque.offer(26);

        System.out.println( aDeque );

        System.out.println( aDeque.peek() );
        System.out.println( aDeque.peekFirst() );
        System.out.println( aDeque.peekLast() );

        System.out.println( aDeque.poll() );
        System.out.println( "poll() " + aDeque );

        System.out.println( aDeque.pollFirst() );
        System.out.println( "pollFirst() " + aDeque );

        System.out.println( aDeque.pollLast() );
        System.out.println( "pollLast() " + aDeque );
    }
}
