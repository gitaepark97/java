package Chapter21;

import java.util.ArrayDeque;
import java.util.Deque;

public class Ex14_Deque {

    public static void main(String[] args) {
        Deque<String> deq = new ArrayDeque<>();

        deq.offerFirst("A");
        deq.offerFirst("B");
        deq.offerFirst("C");

        System.out.println(deq.pollFirst());
        System.out.println(deq.pollFirst());
        System.out.println(deq.pollFirst());

        System.out.println("--------------------");

        deq.offerLast("A");
        deq.offerLast("B");
        deq.offerLast("C");

        System.out.println(deq.pollLast());
        System.out.println(deq.pollLast());
        System.out.println(deq.pollLast());

        System.out.println("--------------------");

        deq.offerLast("A");
        deq.offerLast("B");
        deq.offerLast("C");

        System.out.println(deq.pollFirst());
        System.out.println(deq.pollFirst());
        System.out.println(deq.pollFirst());
    }
}
