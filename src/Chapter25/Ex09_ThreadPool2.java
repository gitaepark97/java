package Chapter25;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Ex09_ThreadPool2 {

    public static void main(String[] args) {
        Runnable task1 = () -> {
            String name = Thread.currentThread()
                .getName();
            try {
                Thread.sleep(5000);
            } catch (Exception e) {}
            System.out.println(name + ": 5초 후 실행");
        };

        Runnable task2 = () -> {
            String name = Thread.currentThread()
                .getName();
            System.out.println(name + ": 바로 실행");
        };

        Runnable task3 = () -> {
            String name = Thread.currentThread()
                .getName();
            try {
                Thread.sleep(2000);
            }catch (Exception e) {}
            System.out.println(name + ": 2초 후 실행");
        };

        ExecutorService pool = Executors.newFixedThreadPool(2);
        pool.submit(task1);
        pool.submit(task2);
        pool.submit(task3);

        pool.shutdown();
    }
}
