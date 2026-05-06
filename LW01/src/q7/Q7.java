package q7;

import javax.swing.*;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Q7 {
    public static void main(String[] args) {
        LocalTime time = LocalTime.now();


        DateTimeFormatter format = DateTimeFormatter.ofPattern("hh:mm:ss a");

        String currentTime = time.format(format);

        JFrame frame = new JFrame(currentTime);

        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
