package lesson02;

import java.util.Scanner;

public class Task05 {
    public static void main(String[] args) {
        System.out.println("Does the number have a real part? True-have, Foulse-haven't");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a number: ");
        double number = scanner.nextDouble();
        double realPart = number % 1;
        boolean check = realPart != 0;
        System.out.printf("the number have a real part - %s", check);
    }
}
