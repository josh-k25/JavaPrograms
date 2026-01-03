package arrays;

public class TwoDArrayPractice {
    public static void main(String[] args) {

        int[][] nums = { {1, 2, 3}, {4, 5, 6} };

        for (int i = 0; i < nums.length; i++) {           // rows
            for (int j = 0; j < nums[i].length; j++) {    // columns
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }
    }
}
