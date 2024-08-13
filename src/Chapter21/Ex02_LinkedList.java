package Chapter21;

import java.util.LinkedList;
import java.util.List;

public class Ex02_LinkedList {

    public static void main(String[] args) {
        List<String> list = new LinkedList<>();

        list.add("orange");
        list.add("apple");
        list.add("apple");
        list.add("banana");

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + "\t");
        }
        System.out.println();

        list.remove(0);

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + "\t");
        }
        System.out.println();
    }
}
