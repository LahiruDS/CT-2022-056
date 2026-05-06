package q3;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter first name: ");
        String first = input.next();

        System.out.print("Enter middle name: ");
        String middle = input.next();

        System.out.print("Enter last name: ");
        String last = input.next();

        char initial = middle.charAt(0);

        System.out.println(first + " " + initial + ". " + last);
    }
}
