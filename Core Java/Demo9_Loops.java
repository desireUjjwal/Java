//while, do-while, for, enhanced for loop
public class Demo9_Loops {
    public static void main(String[] args) {
        int count = 1;
        // While Loop
        System.out.println("While Loop:");
        while (count <= 5) {
            System.out.println("Count: " + count);
            count++;
        }
        // Do-While Loop
        System.out.println("\nDo-While Loop:");
        int doCount = 1;
        do {
            System.out.println("Count: " + doCount);
            doCount++;
        } while (doCount <= 5);
        // For Loop
        System.out.println("\nFor Loop:");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Count: " + i);
        }
        // Enhanced For Loop
        System.out.println("\nEnhanced For Loop:");
        int[] numbers = {10, 20, 30, 40, 50};
        for (int num : numbers) {
            System.out.println("Number: " + num);
        }   
    }
}
