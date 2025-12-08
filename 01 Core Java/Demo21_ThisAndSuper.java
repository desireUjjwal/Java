class A extends Object{
    public A(){
        super(); // Every class in Java extends Object
        System.out.println("Constructor of class A");
    }
    public A(int n){
        super();
        System.out.println("Constructor of Class A int");
    }
    public void show(){
        System.out.println("Hello from class A");
    }
}
class B extends A{
    public B(){
        super();
        System.out.println("Constructor of class B");
    }
    public B(int n){
        this(); // this will call the constructor of same class
        System.out.println("Constructor of Class B int");
    }
}
public class Demo21_ThisAndSuper {
    public static void main(String[] args) {
        B obj = new B(10);
        obj.show();
    }
}
