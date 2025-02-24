import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

// Tugas 6
public class PredicateApp {
    public static void main(String[] args) {
        // String
        List<String> fruits = List.of("Apel", "Pisang", "Alpukat", "Ceri", "Aprikot");

        // Predicate to check which String starts with 'A'
        Predicate<String> startsWithA = s -> s.startsWith("A");

        //Filer using Predicate dan Stream API
        List<String> filteredFruits = fruits.stream()
                .filter(startsWithA)
                .collect(Collectors.toList());

        // Output
        System.out.println(filteredFruits);
    }
}
