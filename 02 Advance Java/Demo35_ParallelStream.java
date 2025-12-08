import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Demo35_ParallelStream {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(10_000);

        Random rand = new Random();
        for (int i = 1; i <= 10_000; i++) {
            nums.add(rand.nextInt(100));
        }
        // int sum1 = nums.stream()
        // .map(i -> i*2)
        // .reduce(0, (c,e)-> c+e);
        long startSeq = System.currentTimeMillis(); // Unix Epoch
        int sum2 = nums.stream()
                .map(i -> {
                    try {
                        Thread.sleep(1);
                    } catch (Exception e) {

                    }
                    return i * 2;
                })
                .mapToInt(i -> i)
                .sum();
        long endSeq = System.currentTimeMillis();

        long startParallel = System.currentTimeMillis();
        int sum3 = nums.parallelStream()
                .map(i -> {
                    try {
                        Thread.sleep(1);
                    } catch (Exception e) {

                    }
                    return i * 2;
                })
                .mapToInt(i -> i)
                .sum();
        long endParallel = System.currentTimeMillis();
        System.out.println(" " + sum2 + " " + sum3);
        System.out.println("Seq: " + (endSeq - startSeq));
        System.out.println("Parallel: " + (endParallel - startParallel));

    }
}
