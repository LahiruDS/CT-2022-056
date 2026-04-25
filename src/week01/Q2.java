import javax.swing.JFrame;
import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter first name: ");
        String first = input.next();

        System.out.print("Enter last name: ");
        String last = input.next();

        String fullName = first + " " + last;


        JFrame frame = new JFrame(fullName);

        frame.setSize(800, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}