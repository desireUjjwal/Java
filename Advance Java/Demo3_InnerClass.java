class A{            // public, abstract and final modifiers are allowed for outer class
    int age;
    public void show(){
        System.out.println("In show method of class A");
    }
    class B{
        public void config(){
            System.out.println("In config method of inner class B");
        }
    }
    static class C{ // We can only declare inner class as static
        public void display(){
            System.out.println("In display method of static inner class C");
        }
    }
}
public class Demo3_InnerClass {
    public static void main(String[] args) {
        A obj = new A(); // Creating instance of outer class A
        obj.show();

        A.B obj1 =obj.new B(); // Creating instance of inner class B
        obj1.config();

        A.C obj2 = new A.C(); // Creating instance of static inner class C
        obj2.display();
    }
}
