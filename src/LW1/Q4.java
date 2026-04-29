import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Q4 {
    public static void main(String[] args) {

        LocalDate today = LocalDate.now();

        DateTimeFormatter format = DateTimeFormatter.ofPattern("d MMMM yyyy");

        System.out.println(today.format(format));
    }
}