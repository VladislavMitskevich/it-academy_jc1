package lesson04;

public class Task03 {
    public static void main(String[] args) {
        System.out.println("output of 10 fibonacci numbers");
        int numberN = 1;
        int numberNMinusOne = 0;
        int numberNPlusOne;
        int startN;
        int limitN = 8;
        System.out.printf("%s, %s, ", numberNMinusOne, numberN);
        for (startN = 1; startN <= limitN; startN++) {
            if (startN < limitN) {
                numberNPlusOne = numberN + numberNMinusOne;
                System.out.printf("%s, ", numberNPlusOne);
                numberNMinusOne = numberN;
                numberN = numberNPlusOne;
            } else {
                numberNPlusOne = numberN + numberNMinusOne;
                System.out.printf("%s. ", numberNPlusOne);
            }
        }
    }
}
