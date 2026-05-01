package LW2;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter length in cm: ");
        double cm = input.nextDouble();

        double totalInches = cm / 2.54;

        int feet = (int)(totalInches / 12);
        double inches = totalInches % 12;

        System.out.println("Feet: " + feet);
        System.out.println("Inches: " + inches);
    }
}