package q10;

import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String word = input.next();

        int length = word.length();

        int middle = length / 2;

        char ch = word.charAt(middle);

        System.out.println(ch);
    }
}
