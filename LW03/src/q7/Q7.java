package q7;

import java.util.Scanner;

public class Q7 {


    public static int countDigits(int num) {
        int count = 0;


        if (num == 0) {
            return 1;
        }


        num = Math.abs(num);

        while (num > 0) {
            num = num / 10;
            count++;
        }

        return count;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.print("Enter an integer (negative to stop): ");
            int number = input.nextInt();

            if (number < 0) {
                System.out.println("Program stopped.");
                break;
            }

            int digits = countDigits(number);
            System.out.println("Number of digits: " + digits);
        }

        input.close();
    }
}