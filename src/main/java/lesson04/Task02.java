package lesson04;

public class Task02 {
    public static void main(String[] args) {
        System.out.println("output of numbers from 10 to 0:");
        int lowLimit = 0;
        for (int number = 10; number >= lowLimit; number--) {
            if (number > lowLimit) {
                System.out.printf("%s, ", number);
            } else {
                System.out.printf("%s. ", number);
            }
        }
    }
}
