package lesson04;

public class Task04 {
    public static void main(String[] args) {
        int firstMultiplier = 1;
        int secondMultiplier = 1;
        int limitMultiplier = 10;
        while (secondMultiplier <= limitMultiplier) {
            while (firstMultiplier <= limitMultiplier) {
                System.out.printf("%2s x %2s = %3s\t", firstMultiplier, secondMultiplier, firstMultiplier * secondMultiplier);
                firstMultiplier++;
            }
            System.out.println();
            firstMultiplier = 1;
            secondMultiplier++;
        }
    }
}
