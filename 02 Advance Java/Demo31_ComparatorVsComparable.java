import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student implements Comparable<Student>{ // Even if we write comparable we can override the logic with comparator
    int age;
    String name;

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student [age=" + age + ", name=" + name + "]";
    }
    public int compareTo(Student that) {
        if (this.age > that.age) {
            return 1;
        } else {
            return -1;
        }
    }

}

public class Demo31_ComparatorVsComparable {
    public static void main(String[] args) {
        // Comparator<Integer> com = new Comparator<Integer>() {
        //     public int compare(Integer i, Integer j) {
        //         if (i % 10 > j % 10) {
        //             return 1;
        //         } else {
        //             return -1;
        //         }
        //     }
        // };
        Comparator<Student> com = (i,  j) ->  i.age > j.age ? 1 : -1;
        

        List<Integer> nums = new ArrayList<>();
        nums.add(43);
        nums.add(31);
        nums.add(72);
        nums.add(29);
        // Collections.sort(nums, com);
        System.out.println(nums);

        List<Student> studs = new ArrayList<>();
        studs.add(new Student(25, "Ujjwal"));
        studs.add(new Student(20, "Shivam"));
        System.out.println(studs);
        // Collections.sort(studs, com);
        Collections.sort(studs, com);
        for (Student s : studs) {
            System.out.println(s);
        }

    }
}
