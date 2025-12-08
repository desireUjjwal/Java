import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;


public class Demo29_Set {
    public static void main(String[] args) {
        // Set<Integer> nums = new HashSet<Integer>();
        Set<Integer> nums = new TreeSet<Integer>();

        nums.add(8);
        nums.add(4);
        nums.add(6);
        nums.add(8);
        
        for(int n: nums){
            System.out.println(n);
        }
        Iterator<Integer> values = nums.iterator();
        while(values.hasNext()){
            System.out.println(values.next());
        }
        
    }
}
