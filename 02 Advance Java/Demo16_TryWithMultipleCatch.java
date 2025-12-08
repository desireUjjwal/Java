public class Demo16_TryWithMultipleCatch {
    public static void main(String[] args) {
        int i = 4;
        int j = 0;

        int nums[] = new int[5];

        String str = null;

        try{
            j = 16 / i; // Critical Statement
            System.out.println("Length of the string: " + str.length()); // This will throw NullPointerException
            System.out.println("Accessing element: " + nums[5]); // This will throw ArrayIndexOutOfBoundsException

        }catch(ArithmeticException e){
            System.out.println("Cannot divide by zero: " + e);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array index is out of bounds: " + e);
        }catch(Exception e){  // It's a compulsion to have the parent class at the end otherwise it will handle all the exceptions and the child classes will never be reached
            System.out.println("Something went wrong: " + e);
        }

        System.out.println("The value of j is: " + j); 

    }
}
