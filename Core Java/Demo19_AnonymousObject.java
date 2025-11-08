class A{
    public A(){
        System.out.println("Constructor of class A");
    }
    public void show(){
        System.out.println("Hello from class A");
    }
}
public class Demo19_AnonymousObject {
    public static void main(String[] args) {
        // A obj; // Reference variable
        // obj = new A(); // Creating object and assigning to reference variable
        new A().show(); // Anonymous Object
        new A().show(); // Another Anonymous Object
    }
}
