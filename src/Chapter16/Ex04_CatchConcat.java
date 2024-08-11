package Chapter16;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex04_CatchConcat {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            int num1 = sc.nextInt();
            int num2 = 10 / num1;
            System.out.println(num2);
        } catch (ArithmeticException | InputMismatchException e) {
            System.out.println("예외 발생");
        } finally {
            System.out.println("Good bye~~!");
        }
    }
}
