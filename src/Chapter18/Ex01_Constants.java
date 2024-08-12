package Chapter18;

interface Human1 {

    int MAN = 1;
    int WOMAN = 2;
}

interface Machine1 {

    int TANK = 1;
    int AIRPLAINE = 2;
}

public class Ex01_Constants {

    public static void main(String[] args) {
        createUnit(Machine1.TANK);
        createUnit(Human1.MAN);
    }

    public static void createUnit(int kind) {
        switch (kind) {
            case Machine1.TANK -> System.out.println("탱크를 만듭니다.");
            case Machine1.AIRPLAINE -> System.out.println("비행기를 만듭니다.");
        }
    }
}
