package Chapter20;

class Npc4 {

    public String toString() {
        return "This is a Npc1.";
    }
}

class Tank4 {

    public String toString() {
        return "This is a Tank1.";
    }
}

class Camp4 {

    private Object unit;

    public void set(Object unit) {
        this.unit = unit;
    }

    public Object get() {
        return unit;
    }
}

public class Ex04_MyGame4 {

    public static void main(String[] args) {
        Camp3 human = new Camp3();
        Camp3 machine = new Camp3();

        human.set("난 공룡");
        machine.set("난 우주인");

        System.out.println(human.get());
        System.out.println(machine.get());
    }
}
