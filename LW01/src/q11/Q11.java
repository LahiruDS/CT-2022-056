package q11;

import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter full name: ");
        String first = input.next();
        String middle = input.next();
        String last = input.next();

        char initial = middle.charAt(0);

        System.out.println(last + ", " + first + " " + initial + ".");
    }
}
