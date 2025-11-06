public class Demo7_LogicalOperators {
    public static void main(String[] args) {
        int x = 7;
        int y = 12;
        // Logical AND (&&)
        System.out.println("Logical AND (x > 5 && y < 15): " + (x > 5 && y < 15)); // true
        System.out.println("Logical AND (x > 10 && y < 15): " + (x > 10 && y < 15)); // false
        // Logical OR (||)
        System.out.println("Logical OR (x > 10 || y < 15): " + (x > 10 || y < 15)); // true
        System.out.println("Logical OR (x > 10 || y > 15): " + (x > 10 || y > 15)); // false
        // Logical NOT (!)
        System.out.println("Logical NOT !(x > 5): " + !(x > 5)); // false
        System.out.println("Logical NOT !(y < 15): " + !(y < 15)); // false
    }
}
