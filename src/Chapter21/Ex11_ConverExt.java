package Chapter21;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Ex11_ConverExt {

    public static void main(String[] args) {
        List<String> fixedSizeList = Arrays.asList("홍길동", "전우치", "전우치", "손오공");

        ArrayList<String> list = new ArrayList<>(fixedSizeList);

        for (String s : list) {
            System.out.print(s.toString() + "\t");
        }
        System.out.println();

        HashSet<String> set = new HashSet<>(list);
        list = new ArrayList<>(set);

        for (String s : list) {
            System.out.print(s.toString() + "\t");
        }
        System.out.println();
    }
}
