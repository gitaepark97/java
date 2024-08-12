package Chapter18;

public class Ex03_Varargs {

    public static void helloEverBody(String... vargs) {
        for (String s : vargs) {
            System.out.print(s + "\t");
        }
        System.out.println();
    }

    public static void main(String[] vargs) {
        helloEverBody("홍길동");
        helloEverBody("홍길동", "전우치");
        helloEverBody("홍길동", "전우치", "손오공");
    }
}
