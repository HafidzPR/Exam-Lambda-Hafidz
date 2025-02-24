import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

// Tugas 1
public class SortDescendingLambdaMain {
    public static void main(String[] args) {
        // String
        List<String> fruits = new ArrayList<>();
        Collections.addAll(fruits, "Pisang", "Apel", "Mangga", "Ceri", "Jeruk");

        // Descending Order
        fruits.sort((a, b) -> b.compareTo(a));

        // Output
        System.out.println(fruits);
    }
}
