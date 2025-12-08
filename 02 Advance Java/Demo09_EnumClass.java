enum Laptop{
    Mackbook(2000), XPS(2200), Surface, Thinkpad(1800); // These are constructor calls 
    private int price;  
    private Laptop() {  // This is a private constructor not a default constructor because we are creating the objects in the same class itself that's how private constructor works
        price = 1500;
    }
    private Laptop(int price) {
        this.price = price;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    

}
public class Demo09_EnumClass {
    public static void main(String[] args) {
        Laptop lp = Laptop.Mackbook;
        System.out.println("Laptop: " + lp + ", Price: " + lp.getPrice());

        for(Laptop l : Laptop.values()) {
            System.out.println("Laptop: " + l + ", Price: " + l.getPrice());
        }
    }
}
