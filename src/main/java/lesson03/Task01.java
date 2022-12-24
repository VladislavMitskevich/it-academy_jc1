package lesson03;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Put the day number");
        int dayNumber = scanner.nextInt();
        switch (dayNumber) {
            case 1:
                System.out.printf("%s - is Monday", dayNumber);
                break;
            case 2:
                System.out.printf("%s - is Tuesday", dayNumber);
                break;
            case 3:
                System.out.printf("%s - is Wednesday", dayNumber);
                break;
            case 4:
                System.out.printf("%s - is Thursday", dayNumber);
                break;
            case 5:
                System.out.printf("%s - is Friday", dayNumber);
                break;
            case 6:
                System.out.printf("%s - is Saturday", dayNumber);
                break;
            case 7:
                System.out.printf("%s - is Sunday", dayNumber);
                break;
            default:
                System.out.println("Put the right day number");
        }
    }
}
