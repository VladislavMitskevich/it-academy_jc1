package lesson02;

public class Task04 {
    public static void main(String[] args) {
        int tripleDdigits = 456;
        final int DISCHARGE_HUNDREDS = 100;
        final int DISCHARGE_TENS = 10;
        int hundredsNumber = tripleDdigits / DISCHARGE_HUNDREDS;
        int tensNumber = tripleDdigits % DISCHARGE_HUNDREDS / DISCHARGE_TENS;
        int unitsNumber = tripleDdigits % DISCHARGE_HUNDREDS % DISCHARGE_TENS;
        System.out.printf("the sum of the digits of a three-digit number = %s", unitsNumber+tensNumber+hundredsNumber);
    }
}
