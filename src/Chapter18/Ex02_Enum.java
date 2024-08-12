package Chapter18;

enum Human2 {MAN, WOMAN}

enum Machine2 {TANK, AIRAPLAIN}

public class Ex02_Enum {

    public static void main(String[] args) {
        createUnit(Machine2.TANK);
//        createUnit(Human2.MAN);
    }

    public static void createUnit(Machine2 kind) {
        switch (kind) {
            case TANK -> System.out.println("탱크를 만듭니다.");
            case AIRAPLAIN -> System.out.println("비행기를 만듭니다.");
        }
    }
}
