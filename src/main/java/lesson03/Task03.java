package lesson03;

import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Put the time");
        int time = scanner.nextInt();
        if (0 <= time && time < 12) {
            System.out.printf("When the time is %s, then- Good Morning", time);
        } else if (12 <= time && time < 17) {
            System.out.printf("When the time is %s, then- Good afternoon", time);
        } else if (17 <= time && time < 20) {
            System.out.printf("When the time is %s, then- Good evening", time);
        } else if (20 <= time && time <=24) {
            System.out.printf("When the time is %s, then- Good night", time);
        }
    }
}
