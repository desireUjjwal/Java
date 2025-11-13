import java.util.Optional;
import java.util.Arrays;
import java.util.List;

public class Demo36_OptionalClass {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Ujjwal", "Laxmi", "John", "Kishor");
        Optional<String> name = names.stream()
                .filter(str -> str.contains("x"))
                .findFirst();

        String name1 = names.stream()
                .filter(str -> str.contains("x"))
                .findFirst()
                .orElse("Not Found");

        System.out.println(name.orElse("Not Found"));
        System.out.println(name.get());
        System.out.println(name1);

    }
}
