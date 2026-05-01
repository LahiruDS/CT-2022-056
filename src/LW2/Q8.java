package LW2;

import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter radius: ");
        double r = input.nextDouble();

        double V =(4.0 / 3.0) * Math.PI * Math.pow(r, 3);

        System.out.println("Volume of sphere: " + V);
    }
}