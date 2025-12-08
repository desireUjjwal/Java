public class Demo18_ExceptionThrow {
    public static void main(String[] args) {
        int i = 20;
        int j = 0;

        try{
            j = 16 / i;
            if(j == 0){
                throw new ArithmeticException("Value of j should not be more than 16");
            }

        }catch(ArithmeticException e){
            j = 16 / 1;
            System.out.println("That's the deafault output. " + e); //That's the deafault output. java.lang.ArithmeticException: Value of j should not be more than 16
        }catch(Exception e){ 
            System.out.println("Something went wrong: " + e);
        }

        System.out.println("The value of j is: " + j); 
    }
}
