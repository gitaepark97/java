package Chapter02;

public class Ex05_DoubleError2 {

    public static void main(String[] args) {
        double dNum = 0.0;

        for (int i = 0; i < 1000; i++) {
            dNum += 0.1;
        }

        System.out.println(dNum);
    }
}
