package Chapter25;

class MyThread2 extends Thread {
    public  void run() {
        int sum = 0;
        for (int i = 0; i <  10; i++) {
            sum += i;
        }
        String name = Thread.currentThread()
            .getName();
        System.out.println(name + ": " + sum);
    }
}

public class Ex02_TreadClass {

    public static void main(String[] args) {
        MyThread2 t = new MyThread2();
        t.start();
        System.out.println("main: " + Thread.currentThread().getName());
    }
}
