class A{
    public void show(){
        System.out.println("In A show method");
    }
}
public class Demo4_AnonymousInnerClass {
    public static void main(String[] args) {
        A obj = new A(){
            @Override
            public void show() {
                System.out.println("In Anonymous Inner Class show method");
            }
        };
        obj.show(); // Calls the overridden method in anonymous inner class
    }
}
