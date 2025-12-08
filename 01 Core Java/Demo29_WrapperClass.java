public class Demo29_WrapperClass {
    public static void main(String[] args) {
        // Integer is called a Wrapper Class because it wraps the primitive data type int in an object
        // Because of Primitive data types, Java is not purely object-oriented --> It helps in memory optimization and performance
        // Wrapper classes provide a way to use primitive data types as objects
        // Each primitive data type has a corresponding wrapper class
        // Collection classes in Java can only store objects, not primitive data types

        int num = 10; // primitive data type
        // Integer num1 = new Integer(num); // Boxing: converting primitive to wrapper object
        Integer num1 = num; // Autoboxing: automatic conversion
        
        // int num2 = num1.intValue(); // Unboxing: converting wrapper object to primitive
        int num2 = num1; // Autounboxing: automatic conversion
        System.out.println(num2);

        String str = "123";
        int num3 = Integer.parseInt(str); // Converting String to primitive int
        System.out.println(num3 + 10); // 133
    }
}
