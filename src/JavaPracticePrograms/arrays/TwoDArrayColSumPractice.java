package JavaPracticePrograms.arrays;

public class TwoDArrayColSumPractice {
    public static void main(String[] args) {

        int[][] nums = { {1, 2, 3}, {4, 5, 6} };

        for (int i = 0; i < nums.length; i++){
            int sum = 0;
            for (int j = 0; j < nums[i].length; j++){
                sum += nums[i][j];
            }
            System.out.println("Row " + i + " sum: " + sum);
        }

        for (int k = 0; k < nums[0].length; k++){
            int sum = 0;
            for (int z = 0; z < nums.length; z++){
                sum += nums[z][k];
            }
            System.out.println("Column " + k + " sum: " + sum);
        }
    }
}
