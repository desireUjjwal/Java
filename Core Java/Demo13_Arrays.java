public class Demo13_Arrays {
    public static void main(String[] args) {
        // single-dimensional array
        int[] numbers = {10, 20, 30, 40, 50};
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Element at index " + i + ": " + numbers[i]);
        }

        int numbers2[] = new int[5];
        numbers2[0] = 5;
        numbers2[1] = 15;
        numbers2[2] = 25;
        numbers2[3] = 35;
        numbers2[4] = 45;
        for (int i = 0; i < numbers2.length; i++) {
            System.out.println("Element at index " + i + ": " + numbers2[i]);
        }

        //multi-dimensional array
        int nums[][] = new int[2][3];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                nums[i][j] = (int)(Math.random()*10);
            }
        }

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                System.out.print(nums[i][j] + " ");
            }System.out.println();
        }
        for(int n[]: nums){
            for(int m: n){
                System.out.print(m + " ");
            }
            System.out.println();
        }

        // Jagged array
        int jaggedArr[][] = new int[3][];
        jaggedArr[0] = new int[2];
        jaggedArr[1] = new int[4];
        jaggedArr[2] = new int[3];
        for (int i = 0; i < jaggedArr.length; i++) {
            for (int j = 0; j < jaggedArr[i].length; j++) {
                jaggedArr[i][j] = (int)(Math.random()*10);
            }
        }
        for (int i = 0; i < jaggedArr.length; i++) {
            for (int j = 0; j < jaggedArr[i].length; j++) {
                System.out.print(jaggedArr[i][j] + " ");
            }
            System.out.println();
        }   
    }
}
