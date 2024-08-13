package Chapter22;

@FunctionalInterface
interface Unit11 {

    String move();
}

public class Ex11_Functional {

    public static void main(String[] args) {
        Unit11 unit = () -> "인강형 유닛 이동";

        System.out.println(unit.move());
    }
}
