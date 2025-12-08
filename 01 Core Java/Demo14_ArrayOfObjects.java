class Student {
    int rollno;
    String name;
    int marks;

    
}
public class Demo14_ArrayOfObjects {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.rollno = 1;
        s1.marks = 88;
        s1.name = "Alice";

        Student s2 = new Student();
        s2.rollno = 2;
        s2.marks = 92;
        s2.name = "Bob";

        Student s3 = new Student();
        s3.rollno = 3;
        s3.marks = 79;
        s3.name = "Charlie";

        Student[] students = new Student[3]; // We are creating an array which can hold Student references not Student objects
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

        for (int i = 0; i < students.length; i++) {
            System.out.println("Student Roll No: " + students[i].rollno);
            System.out.println("Student Name: " + students[i].name);
            System.out.println("Student Marks: " + students[i].marks);
            System.out.println("---------------------------");
        }

        for(Student stu : students){
            System.out.println("Student Roll No: " + stu.rollno);
            System.out.println("Student Name: " + stu.name);
            System.out.println("Student Marks: " + stu.marks);
            System.out.println("---------------------------");
        }
    }
}
