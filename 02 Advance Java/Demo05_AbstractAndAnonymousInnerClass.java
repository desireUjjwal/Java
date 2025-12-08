abstract class A{
    public abstract void show(); // Abstract method in abstract class
    public abstract void config(); // Another abstract method
}
class Demo05_AbstractAndAnonymousInnerClass {
    public static void main(String[] args) {
        A obj = new A(){ // Anonymous inner class extending abstract class A --> If we want to use abstract class only once
            @Override
            public void show() { // Providing implementation for abstract method
                System.out.println("In Anonymous Inner Class extending Abstract Class A");
            }

            @Override
            public void config() { // Providing implementation for another abstract method
                System.out.println("Config method implementation in Anonymous Inner Class");
            }
        };
        obj.show(); // Calls the implemented method in anonymous inner class
        obj.config(); // Calls the implemented config method in anonymous inner class
    }
}
