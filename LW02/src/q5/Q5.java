package q5;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter temperature in Fahrenheit: ");
        double F = scanner.nextDouble();

        double C = (5.0/9) * (F-32);

        System.out.println("Temperature in Celsius: " + C);
    }
}
