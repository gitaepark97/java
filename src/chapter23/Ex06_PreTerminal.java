package chapter23;

import java.util.stream.IntStream;

public class Ex06_PreTerminal {

    public static void main(String[] args) {
        int sum = IntStream.of(1, 3, 5, 7, 9)
            .sum();
        System.out.println("sum = " + sum);

        long cnt = IntStream.of(1, 3, 5, 7, 9)
            .count();
        System.out.println("count = " + cnt);

        IntStream.of(1, 3, 5, 7, 9)
            .average()
            .ifPresent(avg -> System.out.println("avg = " + avg));

        IntStream.of(1, 3, 5, 7, 9)
            .min()
            .ifPresent(avg -> System.out.println("min = " + avg));

        IntStream.of(1, 3, 5, 7, 9)
            .max()
            .ifPresent(avg -> System.out.println("max = " + avg));
    }
}
