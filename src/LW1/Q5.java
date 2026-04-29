import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Q5 {
    public static void main(String[] args) {

        // get today's date
        LocalDate today = LocalDate.now();

        // required format
        DateTimeFormatter format = DateTimeFormatter.ofPattern("EEEE, MMMM d, yyyy");

        // print formatted date
        System.out.println(today.format(format));
    }
}