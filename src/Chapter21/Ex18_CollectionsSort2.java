package Chapter21;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class StringDesc implements Comparator<String> {

    public int compare(String s1, String s2) {
        return s2.compareTo(s1);
    }
}

public class Ex18_CollectionsSort2 {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("홍길동");
        list.add("전우치");
        list.add("손오공");

        Collections.sort(list);
        System.out.println(list);

        StringDesc cmp = new StringDesc();

        Collections.sort(list, cmp);
        System.out.println(list);
    }
}
