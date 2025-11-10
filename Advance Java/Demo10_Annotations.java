class A{
    public void showTheDataWhichBelongsToThisClass(){
        System.out.println("In A show");
    }
}
class B extends A{
    @Override
    public void showTheDataWhichBelongsToThisClass(){
        System.out.println("In B show");
    }
}
public class Demo10_Annotations {
    public static void main(String[] args) {
        //Annotations are metadata that provide information about the program but are not part of the program itself.
        //They have no direct effect on the operation of the code they annotate.
        //Here we are using @Override annotation to indicate that the method is overriding a method from its superclass. So even if we make a mistake in method signature, the compiler will give an error.
        B obj = new B();
        obj.showTheDataWhichBelongsToThisClass(); // Calls the overridden method in class B

    }
}
