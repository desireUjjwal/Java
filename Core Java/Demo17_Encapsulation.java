class Human{
    private int age;
    private String name;
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
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
        obj.setName("Ujjwal");
        System.out.println("Name: " + obj.getName());
        System.out.println("Age: " + obj.getAge());

    }
}
