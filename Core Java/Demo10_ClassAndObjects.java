class Calculator {
    int add(int a, int b) {
        return a + b;
    }
}
public class Demo10_ClassAndObject {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;
        Calculator calc = new Calculator();
        int sum = calc.add(num1, num2);
        System.out.println("Sum: " + sum);
    }
}

// Object has properties and behaviors
// Class is a blueprint for creating objects
// An object is an instance of a class
