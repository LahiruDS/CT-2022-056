package q11;

import java.util.Scanner;
import java.util.Random;

public class Q11 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        int number = rand.nextInt(100) + 1;
        int guess;

        System.out.println("Guess the number between 1 and 100!");

        while (true) {
            System.out.print("Enter your guess: ");
            guess = input.nextInt();

            if (guess < number) {
                System.out.println("Higher!");
            } else if (guess > number) {
                System.out.println("Lower!");
            } else {
                System.out.println("Correct! You guessed the number.");
                break;
            }
        }

        input.close();
    }
}