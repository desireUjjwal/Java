class A{
    public void show1(){
        System.out.println("In A show");
    }
}
class B extends A{
    public void show2(){
        System.out.println("In B show");
    }
}
public class Demo28_TypeCasting {
    public static void main(String[] args) {
        A obj1 = new B(); // Upcasting (Implicit)
        obj1.show1(); // In A show
        
        B obj2 = (B) obj1; // Downcasting (Explicit)
        obj2.show2();
    }
}
