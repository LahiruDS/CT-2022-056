package q9;

import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter principal (P): ");
        double P = scanner.nextDouble();

        System.out.print("Enter interest rate (R): ");
        double R = scanner.nextDouble();

        System.out.print("Enter number of years (N): ");
        int N = scanner.nextInt();

        double amount = P * Math.pow(1 + (R / 100.0), N);

        System.out.println("Amount after " + N + " years: " + amount);

    }
}
