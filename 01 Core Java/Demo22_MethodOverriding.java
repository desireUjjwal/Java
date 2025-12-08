class A{
    public void show(){
        System.out.println("Hello from class A");
    }
}
class B extends A{
    @Override
    public void show(){
        System.out.println("Hello from class B");
    }
}
public class Demo22_MethodOverriding {
    public static void main(String[] args) {
        B obj = new B();
        obj.show(); // This will call the overridden method in class B
    }
}
