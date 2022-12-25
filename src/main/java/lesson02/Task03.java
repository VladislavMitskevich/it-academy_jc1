package lesson02;

public class Task03 {
    public static void main(String[] args) {
        int radius = 4;
        double circleSqure =  Math.PI * radius * radius;
        double circleLength = 2 * Math.PI * radius;
        System.out.printf("area of the circle = PI * %s^2 = %s\n", radius, String.format("%.3f", circleSqure));
        System.out.printf("circle length = PI * 2 * %s = %s", radius, String.format("%.3f", circleLength));
    }
}
