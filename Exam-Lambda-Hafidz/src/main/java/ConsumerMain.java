import java.util.List;
import java.util.function.Consumer;

// Tugas 4
public class ConsumerMain {
    public static void main(String[] args) {
        // Input Names
        List<String> names = List.of("Alice", "Bob", "Charlie");

        // Consumer prints name as CAPITAL
        Consumer<String> printUpperCase = name -> System.out.println(name.toUpperCase());

        // Applay to Consumer
        names.forEach(printUpperCase);
    }
}
