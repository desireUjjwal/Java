interface A{
    int add(int x, int y); // Method with return type
}
public class Demo14_LambdaExpressionWithReturn {
    public static void main(String[] args) {
        // A obj = (x, y) -> {
        //     System.out.println("Adding " + x + " and " + y);
        //     return x + y; // Returning the sum of x and y
        // };
        A obj = (x, y) -> x + y; // Single line lambda expression with return
        int result = obj.add(10, 20); // Calling the add method
        System.out.println("Sum: " + result); // Printing the result
    }
}
