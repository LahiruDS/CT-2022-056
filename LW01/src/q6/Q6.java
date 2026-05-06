package q6;

import javax.swing.*;
import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter width: ");
        int w = input.nextInt();

        System.out.print("Enter height: ");
        int h = input.nextInt();

        System.out.print("Enter title: ");
        String title = input.next();


        JFrame frame = new JFrame(title);

        frame.setSize(w, h);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
