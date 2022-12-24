package lesson03;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Put the day number");
        int dayNumber = scanner.nextInt();
        if (dayNumber == 1) {
            System.out.printf("%s - is Monday", dayNumber);
        } else if (dayNumber == 2) {
            System.out.printf("%s - is Tuesday", dayNumber);
        } else if (dayNumber == 3) {
            System.out.printf("%s - is Wednesday", dayNumber);
        } else if (dayNumber == 4) {
            System.out.printf("%s - is Thursday", dayNumber);
        } else if (dayNumber == 5) {
            System.out.printf("%s - is Friday", dayNumber);
        } else if (dayNumber == 6) {
            System.out.printf("%s - is Saturday", dayNumber);
        } else if (dayNumber == 7) {
            System.out.printf("%s - is Sunday", dayNumber);
        }
    }
}
