import java.util.HashMap;
import java.util.Map;

public class Demo30_Map {
    public static void main(String[] args) {
        Map<String, Integer> students = new HashMap<>(); // Hashtable is synchronized HashMap is not
        students.put("Ujjwal", 100);
        students.put("Ram", 98);
        students.put("Shyam", 99);
        students.put("Mohan", 50);
        System.out.println(students);
        System.out.println(students.keySet());
        for(String key : students.keySet()){
            System.out.println("Name : " + students.get(key));
        }

    }
}
