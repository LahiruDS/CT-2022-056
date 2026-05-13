package q6;

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Your Born year: ");
        int year = scanner.nextInt();

        int age = 2026-year;

        System.out.println("You are "+age+" years old");
    }
}
