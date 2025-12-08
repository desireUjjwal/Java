public class Demo15_Exception {
    public static void main(String[] args) {
        // There are 3 types of errors in Java:
        // 1. Compile-time Errors: These errors are detected by the compiler during the compilation process.
        // 2. Runtime Errors: These errors occur during the execution of the program. (Exceptions) 
        // 3. Logical Errors: These errors occur when the program runs without crashing but produces incorrect results.

        // Statement can be of two types:
        // 1. Normal Statements: These statements execute without any issues.
        // 2. Critical Statements: These statements may lead to exceptions during execution. (We should handle these statements using try-catch blocks)
        int i = 0;
        int j = 0;

        try{
            j = 16 / i; // Critical Statement

        }catch(Exception e){
            System.out.println("Exception occurred: " + e);
        }

        System.out.println("The value of j is: " + j); // Normal Statement

    }
}
