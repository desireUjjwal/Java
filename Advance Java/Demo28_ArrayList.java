import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Demo28_ArrayList {
    public static void main(String[] args) {
        // Collection<Integer> nums = new ArrayList<Integer>(); // Generics -- Like templates in c++
        List<Integer> nums = new ArrayList<Integer>();
        nums.add(5);
        nums.add(4);
        nums.add(5);
        nums.add(9);
        // nums.add("5"); // This will give an error we are using generics otherwise it won't give an error
        System.out.println(nums);
        System.out.println(nums.get(2));
        System.out.println(nums.indexOf(5));
        for(int x: nums){
            System.out.println(x);
        }

    }
}
