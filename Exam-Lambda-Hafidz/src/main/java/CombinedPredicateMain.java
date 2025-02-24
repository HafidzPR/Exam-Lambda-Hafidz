import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

// Tugas 7
public class CombinedPredicateMain {
    public static void main(String[] args) {
        // String
        List<String> words = List.of("Apel", "Alpukat", "Almond", "Aprikot", "Ace", "Pisang");

        // Predicate 1: String that starts with 'A'
        Predicate<String> startsWithA = s -> s.startsWith("A");

        // Predicate 2: String longer than 5 characters
        Predicate<String> lengthGreaterThan5 = s -> s.length() > 5;

        // Combined 2 predicate with AND (&&)
        Predicate<String> combinedPredicate = startsWithA.and(lengthGreaterThan5);

        // Filer list with  Stream API
        List<String> filteredWords = words.stream()
                .filter(combinedPredicate)
                .collect(Collectors.toList());

        // Output
        System.out.println(filteredWords);
    }
}
