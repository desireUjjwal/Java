@FunctionalInterface
interface A{
    void show(); // Single abstract method
}
public class Demo12_FunctionalInterface {
    public static void main(String[] args) {
        // After Java 8, we can use lambda expressions with functional interfaces the reason behind this was to make java less verbose
        // Here, we are using an anonymous inner class to implement the functional interface A
        A obj = new A(){
            @Override
            public void show() {
                System.out.println("In show method of Functional Interface A");
            }
        };
        obj.show();
    }
}
