package Chapter21;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Ex20_CollectionsCopy {

    public static void main(String[] args) {
        List<String> src = Arrays.asList("홍길동", "전우치", "손오공", "멀린");

        List<String> dst = new ArrayList<>(src);
        System.out.println(dst);

        Collections.sort(dst);
        System.out.println(dst);

        Collections.copy(dst, src);
        System.out.println(dst);
        
        dst.remove(0);
        System.out.println(dst);
    }
}
