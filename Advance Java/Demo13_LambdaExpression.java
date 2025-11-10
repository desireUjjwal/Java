interface A{
    void show(int i);
}
public class Demo13_LambdaExpression {
    public static void main(String[] args) {
        // Lambda expression is also called Syntactic sugar to reduce the verbosity of the code
        // A obj = () -> { // this arrow is called lambda operator and this expression is called lambda expression 
        //         System.out.println("In show method of Functional Interface A using Lambda Expression");
        //         System.out.println("Lambda Expression makes the code less verbose" );
        //     };
        // obj.show();
        A obj = i -> System.out.println("In show method of Functional Interface A using Lambda Expression " + i);
        obj.show(5);
    }
}
