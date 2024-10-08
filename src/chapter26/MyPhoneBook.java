package chapter26;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class MyPhoneBook {

    static Scanner sc = new Scanner(System.in);
    static Map<String, PhoneInfo> map = new HashMap<>();

    public static void main(String[] args) {
        readInfo();
        int choice;

        while (true) {
            showMenu();
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1 -> addNumber();
                case 2 -> selNumber();
                case 3 -> delNumber();
                case 4 ->  {
                    saveInfo();
                    System.out.println("프로그램을 종료합니다.");
                    return;
                }
                default -> System.out.println("잘못 입력하셨습니다.");
            }
        }
    }

    public static void showMenu() {
        System.out.println("[메뉴 선택]");
        System.out.println("1. 전화번호 입력");
        System.out.println("2. 전화번호 조회");
        System.out.println("3. 전화번호 삭제");
        System.out.println("4. 종료");
        System.out.print("선택 : ");
    }

    public static void addNumber() {
        System.out.print("이름 : ");
        String name = sc.nextLine();
        System.out.print("전화번호 : ");
        String phoneNumber = sc.nextLine();
        System.out.print("이메일 : ");
        String email = sc.nextLine();

        PhoneInfo pInfo;
        if (email != null) {
            pInfo = new PhoneInfo(name, phoneNumber, email);
        } else {
            pInfo = new PhoneInfo(name, phoneNumber);
        }

        map.put(name, pInfo);
    }

    public static void selNumber() {
        System.out.print("조회할 이름 : ");
        String name = sc.nextLine();

        PhoneInfo pInfo = map.get(name);
        pInfo.showPhoneInfo();
    }

    public static void delNumber() {
        System.out.print("삭제할 이름 : ");
        String name = sc.nextLine();

        PhoneInfo pInfo = map.remove(name);
        if (pInfo != null) {
            System.out.println("삭제되었습니다.");
        } else {
            System.out.println("해당 값이 없습니다.");
        }
    }

    public static  void saveInfo() {
        try (ObjectOutputStream oo = new ObjectOutputStream(new FileOutputStream("./Object.bin"))) {
            Set<String> ks = map.keySet();
            for (String s : ks) {
                PhoneInfo pInfo = map.get(s);
                oo.writeObject(pInfo);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void readInfo() {
        try (ObjectInputStream oi = new ObjectInputStream(new FileInputStream("./Object.bin"))) {
            while (true) {
                PhoneInfo pInfo = (PhoneInfo) oi.readObject();
                if (pInfo == null) {
                    break;
                }
                map.put(pInfo.name, pInfo);
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
        }
    }
}
