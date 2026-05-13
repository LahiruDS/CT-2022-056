package q4;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Your weight (in pounds ):");
        double W = scanner.nextDouble();

        double C = W * 19;

        System.out.println("Calories needed per day:" + C);
    }
}
