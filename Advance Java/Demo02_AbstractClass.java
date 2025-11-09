abstract class Car{
    public abstract void drive(); // Abstract method can only be declared in abstract class
    public void playMusic(){  // Abstract class can have all concrete methods
        System.out.println("Playing music");
    }
}

class WagonR extends Car{ // Concrete class
    @Override
    public void drive() {        // We need to provide implementation of abstract method
        // If all abstract methods are not implemented, then the subclass must be declared abstract
        System.out.println("Driving WagonR");
    }
}
public class Demo02_AbstractClass {
    public static void main(String[] args) {
        // Car myCar = new Car(); // Error: Cannot instantiate the abstract class
        Car myCar = new WagonR(); // Upcasting
        myCar.drive(); // Calls the implemented method in WagonR
    }
}
