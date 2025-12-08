import java.util.Arrays;
import java.util.List;

public class Demo37_MethodReference {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Navin","Harsh","John");
        
        List<String> uNames = names.stream()
                                //    .map(name -> name.toUpperCase())
                                   .map(String::toUpperCase) // We are passing a function to a function
                                   .toList();
        System.out.println(uNames);
        uNames.forEach(System.out::println);
    }
}
