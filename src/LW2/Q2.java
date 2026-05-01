package LW2;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter length in cm: ");
        double cm = input.nextDouble();

        // convert cm to inches
        double totalInches = cm / 2.54;

        // convert inches to feet and remaining inches
        int feet = (int)(totalInches / 12);
        double inches = totalInches % 12;

        // output
        System.out.println("Feet: " + feet);
        System.out.println("Inches: " + inches);
    }
}