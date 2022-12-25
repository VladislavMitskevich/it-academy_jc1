package lesson03;

import java.util.Scanner;

public class Task04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Put the time");
        int time = scanner.nextInt();
        switch (time) {
            case 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11:
                System.out.printf("When the time is %s, then- Good Morning", time);
                break;
            case 12, 13, 14, 15, 16:
                System.out.printf("When the time is %s, then- Good afternoon", time);
                break;
            case 17, 18, 19, 20:
                System.out.printf("When the time is %s, then- Good evening", time);
                break;
            case 21, 22, 23, 24:
                System.out.printf("When the time is %s, then- Good night", time);
                break;
            default:
                System.out.println("Put the right time number");
        }
    }
}
