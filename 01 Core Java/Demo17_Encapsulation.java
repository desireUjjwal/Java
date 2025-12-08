class Human{
    private int age;
    private String name;
    public int getAge() {
        return age;
    }
    public void setAge(int age) {   //(int age, Human obj))
        // obj.age = age;
        this.age = age;   // this keyword is used to refer to the current object's instance variable
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
public class Demo17_Encapsulation {
    public static void main(String[] args) {
        Human obj = new Human();
        obj.setAge(25);
        // obj.setAge(25, obj); // If we won't use this then we need to pass the obj to change it
        obj.setName("Ujjwal");
        System.out.println("Name: " + obj.getName());
        System.out.println("Age: " + obj.getAge());

    }
}
