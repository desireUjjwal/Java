public class Demo17_ExceptionHierarchy {
    public static void main(String[] args) {
        // Object --> Throwable --> 1. Error
        //                          2. Exception 
        // Error
        // 1. ThreadDeath
        // 2. VirtualMachineError
        //    a. OutOfMemoryError
        //    b. StackOverflowError
        // 3. IOError
        //
        // Exception
        // 1. Checked Exception (Compile-time Exception) Compiler forces you to handle these exceptions
        //    a. IOException
        //    b. SQLException
        //    c. ClassNotFoundException
        // 2. Unchecked Exception (Runtime Exception) There is no compulsion to handle these exceptions
        //    a. ArithmeticException
        //    b. NullPointerException
        //    c. ArrayIndexOutOfBoundsException
    }
}
