
import interfacespack.StringModifier;

// Tugas 3
public class CustomFunctionalInterfaceMain {
    public static void main(String[] args) {
        String input = "hello lambda world";

        // Lambda change text to capital
        StringModifier toUpperCase = s -> s.toUpperCase();

        // Lambda change spaces to (-)
        StringModifier replaceSpaces = s -> s.replace(" ", "-");

        // Using 2 lambda in order
        String result = replaceSpaces.modify(toUpperCase.modify(input));

        // Output
        System.out.println(result);
    }
}
