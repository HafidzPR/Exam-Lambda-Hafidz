import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

// Tugas 2
public class FilterEvenNumbersMain {
    public static void main(String[] args) {
        // Input integer
        List<Integer> numbers = List.of(10, 3, 7, 14, 5, 20, 6, 9);

        // Filter even integer menggunakan Stream API dan Lambda
        List<Integer> evenNumbers = numbers.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());

        // Output (Even Numbers only)
        System.out.println(evenNumbers);
    }
}
