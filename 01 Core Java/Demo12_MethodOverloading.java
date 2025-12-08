class Calculator {
    // Method to add two integers
    public int add(int a, int b) {
        return a + b;
    }

    // Overloaded method to add three integers
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Overloaded method to add two double values
    public double add(double a, double b) {
        return a + b;
    }
}
public class Demo12_MethodOverloading {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        int sumTwo = calc.add(10, 20);
        int sumThree = calc.add(10, 20, 30);
        double sumDouble = calc.add(10.5, 20.5);
        System.out.println("Sum of two integers: " + sumTwo);
        System.out.println("Sum of three integers: " + sumThree);
        System.out.println("Sum of two doubles: " + sumDouble);
    }
}
