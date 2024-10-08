package Chapter22;

class Outer1 {

    private int speed = 10;

    class MemberInner1 {

        public void move() {
            System.out.printf("인간형 유닛이 %d 속도로 이동합니다.\n", speed);
        }
    }

    public void getMarine() {
        MemberInner1 inner = new MemberInner1();
        inner.move();
    }
}

public class Ex01_MemberInner {

    public static void main(String[] args) {
        Outer1 out = new Outer1();

        out.getMarine();

        Outer1.MemberInner1 inner = out.new MemberInner1();

        inner.move();
    }
}
