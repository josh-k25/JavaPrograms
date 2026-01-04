package JavaPracticePrograms.arrays;

public class TwoDArrayMaxPractice {
    public static void main(String[] args) {
        int[][] nums = { {3, 7, 2}, {9, 1, 5} };

        int max;
        int row = 0;
        int col = 0;

        max = nums[0][0];
        for (int i = 0; i < nums.length; i++){
            for (int j = 0; j < nums[i].length; j++){
                if (max < nums[i][j]){
                    max = nums[i][j];
                    row = i;
                    col = j;
                }
            }
        }

        System.out.println("Max: " + max);
        System.out.println("Row: " + row);
        System.out.println("Col: " + col);


    }
}
