import java.time.Instant;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Instant data01 = Instant.now();

        DateTimeFormatter data = DateTimeFormatter.ISO_INSTANT;

        System.out.println(data.format(data01));

    }
}