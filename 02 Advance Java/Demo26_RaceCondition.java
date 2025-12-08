class Counter{
    int count;
    public synchronized void increment(){ // making synchronized we are ensuring that increment function is called at only by one thread at a time
        count++;
    }
}
public class Demo26_RaceCondition {
    public static void main(String[] args) throws InterruptedException {
        // If we are doing mutation with threads it's not a good idea
        // two threads t1 and t2 tries to access same function show at the same time we should make sure only one will get access at one time
        // If we think there are some function which can do mutation we should make it thread safe
        Counter c = new Counter();
        Runnable obj1 = () -> {
            for(int i=1; i<=1000; i++){
                c.increment();
            }
        };
        
        Runnable obj2 = () -> {
            for(int i=1; i<=1000; i++){
                c.increment();
            }
        };

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();

        t1.join();
        t2.join();
        System.out.println(c.count);
    }
}
