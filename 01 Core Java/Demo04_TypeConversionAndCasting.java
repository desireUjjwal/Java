class Demo4_TypeConversionAndCasting {
    public static void main(String[] args) {
        // Implicit Type Conversion (Widening)
        int intValue = 257;
        double doubleValue = intValue; // int to double
        
        System.out.println("Implicit Conversion: int to double: " + doubleValue);

        // Explicit Type Casting (Narrowing)
        double anotherDoubleValue = 9.78;
        int anotherIntValue = (int) anotherDoubleValue; // double to int
        byte byteValue = (byte) intValue; // int to byte (257 % 256 = 1)
        System.out.println("Explicit Casting: int to byte: " + byteValue);
        System.out.println("Explicit Casting: double to int: " + anotherIntValue);


        byte a = 10;
        byte b = 30;
        int result = a * b; // byte values are promoted to int during arithmetic operations (Type Promotion)
        System.out.println("Result of byte multiplication (promoted to int): " + result); 
    }
}
