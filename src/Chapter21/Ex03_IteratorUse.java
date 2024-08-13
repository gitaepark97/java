package Chapter21;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Ex03_IteratorUse {

    public static void main(String[] args) {
        List<String> list = new LinkedList<>();

        list.add("orange");
        list.add("apple");
        list.add("apple");
        list.add("banana");

        for (String s : list) {
            System.out.print(s + "\t");
        }
        System.out.println();

        Iterator<String> itr = list.iterator();

        String str;
        while (itr.hasNext()) {
            str = itr.next();
            System.out.print(str + "\t");

            if (str.equals("orange")) {
                itr.remove();
            }
        }
        System.out.println();

        itr = list.iterator();

        while (itr.hasNext()) {
            System.out.print(itr.next() + "\t");
        }
        System.out.println();
    }
}
