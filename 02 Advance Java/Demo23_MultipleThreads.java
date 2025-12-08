class A extends Thread{
    public void run(){ // Whenever we write start in thread, it will search for run method.
        for(int i=1; i<100; i++){
            System.out.println("Hi");
        }
    }
}

class B extends Thread{
    public void run(){
        for(int i=0; i<100; i++){
            System.out.println("Hello");
        }
    }
}
public class Demo23_MultipleThreads {
    public static void main(String[] args) {
        // Threads -> Smallest unit in a program
        A obj1 = new A();
        B obj2 = new B();
        
        obj1.start();
        obj2.start();
    }
}
