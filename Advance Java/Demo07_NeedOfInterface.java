interface Computer{
    public abstract void code();
}
class Laptop implements Computer{
    public void code(){
        System.out.println("Code, compile and run using Laptop");
    }
}
class Desktop implements Computer{
    public void code(){
        System.out.println("Code, compile and run using Desktop");
    }
}
class Developer{
    public void devApp(Computer comp){
        comp.code();
    }
}
public class Demo07_NeedOfInterface {
    public static void main(String[] args) {
        Computer lap = new Laptop();
        Computer desk = new Desktop();
        Developer dev = new Developer();
        dev.devApp(lap);
        dev.devApp(desk);
    }
}
