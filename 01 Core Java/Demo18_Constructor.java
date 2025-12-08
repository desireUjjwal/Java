class Human{
    String name;
    int age;

    // Constructor
    Human(String name, int age) { //If we are using any parameterized constructor then default constructor is not provided by JVM
        this.name = name;
        this.age = age;
    }
}
public class Demo18_Constructor {
    public static void main(String[] args) {
        Human person = new Human("Alice", 30);
        System.out.println("Name: " + person.name);
        System.out.println("Age: " + person.age);
    }
}
