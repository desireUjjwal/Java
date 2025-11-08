class Mobile{
    String brand; // instance variable allocated memory in heap
    int price;
    static String name;
    static{       // static block will be executed only once when the class is loaded
        name = "DefaultPhone"; // static block to initialize static variable
        System.out.println("Static block executed");
    }
    public Mobile(){
        brand = "";
        price = 0;
        System.out.println("Constructor executed");
    }

    public void showDetails(){
        System.out.println("Brand: "+ brand);
        System.out.println("Price: "+ price);
        System.out.println("Name: "+ name);
    }

    public static void showDetails1(){      // We cannot use not static variables inside static method
        // System.out.println("Brand: "+ brand); // Error
        // System.out.println("Price: "+ price); // Error
        System.out.println("Name: "+ name); // static variable can be used  inside static method
    }
}
public class Demo16_Static {
    public static void main(String[] args) throws ClassNotFoundException { // If we don't use static here, JVM won't be able to call main method without creating object of Demo16_Static class
        Class.forName("Mobile");     // This will load the Mobile class and execute static block
        Mobile obj1 = new Mobile();
        obj1.brand = "Apple";
        obj1.price = 1000;
        Mobile.name = "iPhone"; // static variable is shared among all objects of the class

        Mobile obj2 = new Mobile();
        obj2.brand = "Samsung";
        obj2.price = 800;
        Mobile.name = "Galaxy"; // changing static variable value
        Mobile.name = "Phone"; // changing static variable using class name that's the recommended way

        obj1.showDetails();
        obj2.showDetails();
        Mobile.showDetails1(); // calling static method using class name that's the recommended way
    }
}

