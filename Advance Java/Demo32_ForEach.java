import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Demo32_ForEach {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(4,5,7,3,2,6);
        
        Consumer<Integer> con= new Consumer<Integer>() {

            @Override
            public void accept(Integer t) {
                System.out.println(t);
            }
            
        };
        nums.forEach(con);
        // nums.forEach(t -> System.out.println(t));
        
    }
}
