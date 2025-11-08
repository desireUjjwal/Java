import Demo20_tools.*;   // * is used for files in the package not folders
public class Demo20_Inheritence {
    public static void main(String[] args) {
        // Multiple inheritance is not supported in Java using classes
        // but can be achieved using interfaces.
        AdvCalculator calc = new AdvCalculator();
        int sum = calc.add(5, 3);
        int difference = calc.subtract(10, 4);
        int multiply = calc.multiply(2, 3);
        double division = calc.divide(10, 2);
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Multiplication: " + multiply);
        System.out.println("Division: " + division);
    }
}
