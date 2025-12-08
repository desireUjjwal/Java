class A{
    public void show() throws ClassNotFoundException{
        Class.forName("Calc");
    }
}
public class Demo20_DuckingExceptionUsingThrows {
    static{
            System.out.println("Class Loaded");
        }
    public static void main(String[] args) {
        A obj = new A();
        try {
            obj.show();
        } catch (ClassNotFoundException e) {
            e.printStackTrace(); // It prints the entire stack which method is calling which method so that we can track entire method calls
        };
    }
}
