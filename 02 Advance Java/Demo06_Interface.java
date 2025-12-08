interface A{
    // By default, all methods in interface are public and abstract
    // So, we do not need to explicitly use public and abstract keywords
    // All the variables declared in interface are public, static and final by default
    // class-class : extends, interface-interface : extends, class-interface : implements
    String state = "Bihar"; // public static final variable
    void show(); 
    void config();
}
interface X{
    void display();
}
interface Y extends A, X{ // Interface can extend multiple interfaces
    void test();
}
class B implements A, X{ // If we fail to implement all methods of interface, then class B must be declared abstract
    @Override
    public void show() {
        System.out.println("In show method of class B implementing interface A");
    }

    @Override
    public void config() {
        System.out.println("In config method of class B implementing interface A");
    }
    @Override
    public void display() {
        System.out.println("In display method of class B implementing interface X");
    }
}
public class Demo06_Interface {
    public static void main(String[] args) {
        A obj = new B();
        obj.show();
        obj.config();
        System.out.println("State: " + A.state); // Accessing interface variable
        X obj1 = new B();
        obj1.display();
    }
}
