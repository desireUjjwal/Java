class A{
    public void show(){
        System.out.println("In A show");
    }
}
class B extends A{
    @Override
    public void show(){
        System.out.println("In B show");
    }
}
class C extends B{
    @Override
    public void show(){
        System.out.println("In C show");
    }
}
public class Demo25_DynamicMethodDispach {     // here which method will be called is decided at runtime so it is called Dynamic Method Dispatch
    public static void main(String[] args) {
        A obj = new A();
        obj.show(); // In A show

        obj = new B();
        obj.show(); // In B show

        obj = new C();
        obj.show(); // In C show
    }
}
