// There are two types of data types in Java
// 1. Primitive Data Types (8)
// 2. Non-Primitive Data Types
// Java follows unicode system to represent characters
public class Demo2_DataTypes {
    public static void main(String[] args) {
        int num1 = 9; // int range is -2,147,483,648 to 2,147,483,647
        byte num2 = 127; // byte range is -128 to 127
        short num3 = -32768; // short range is -32768 to 327
        long num4 = 9999999999L; // long range is -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
        float num5 = 5.67f; // float range is up to 7
        double num6 = 19.99; // double range is up to 15
        char letter = 'A'; // char range is 0 to 65,535
        boolean status = true; // boolean values are true or false

        System.out.println("Integer value: " + num1);
        System.out.println("Byte value: " + num2);
        System.out.println("Short value: " + num3);
        System.out.println("Long value: " + num4);
        System.out.println("Float value: " + num5);
        System.out.println("Double value: " + num6);
        System.out.println("Character value: " + letter);
        System.out.println("Boolean value: " + status);
    }
}
