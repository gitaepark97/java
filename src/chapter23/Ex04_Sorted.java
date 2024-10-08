package chapter23;

import java.util.Arrays;
import java.util.List;

public class Ex04_Sorted {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("홍길동", "멀린", "해리포터");

        list.stream()
            .sorted()
            .forEach(n -> System.out.print(n + "\t"));
        System.out.println();

        list.stream()
            .sorted((s1, s2) -> s1.length() - s2.length())
            .forEach(n -> System.out.print(n + "\t"));
        System.out.println();
    }
}
