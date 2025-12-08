class Computer{
    public void playMusic(){
        System.out.println("Playing music...");
    }
    public String getMeAPen(int cost){
        if(cost >= 10)
            return "Here is a pen.";
        return "Not enough money for a pen.";
    }
}
public class Demo11_Methods {
    public static void main(String[] args) {
        Computer obj = new Computer();
        obj.playMusic();
        String penResponse = obj.getMeAPen(5);
        System.out.println(penResponse);
    }
}
