class NewException extends Exception{ // Exception can also be replaced with RuntimeException
    public NewException(String str){
        super(str);
    }
}
public class Demo19_CustomException {
    public static void main(String[] args) {
        int i = 20;
        int j = 0;

        try{
            j = 16 / i;
            if(j == 0){
                throw new NewException("Value of j should not be more than 16");
            }

        }catch(NewException e){
            j = 16 / 1;
            System.out.println("That's the deafault output. " + e);
        }catch(Exception e){ 
            System.out.println("Something went wrong: " + e);
        }

        System.out.println("The value of j is: " + j); 
    }
}
