import java.util.function.BiFunction;

// Tugas 5
public class BiFunctionMain {
    public static void main(String[] args) {
        // BiFunction yang menjumlahkan dua angka
        BiFunction<Integer, Integer, Integer> addNumbers = (a, b) -> a + b;

        // Input numbers
        int result = addNumbers.apply(10, 20);

        // Output
        System.out.println(result);
    }
}
