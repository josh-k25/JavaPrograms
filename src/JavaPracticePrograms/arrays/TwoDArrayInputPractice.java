package JavaPracticePrograms.arrays;
import java.util.Scanner;

public class TwoDArrayInputPractice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, j; //rows and cols

        System.out.println("How many rows are in this array? ");
        i = sc.nextInt();

        System.out.println("How many columns are in this array? ");
        j = sc.nextInt();

        int[][] nums = new int[i][j];

        for (int k = 0; k < nums.length; k++){
            for (int l = 0; l < nums[k].length; l++){
                System.out.println("What is the value for the array position [" + k + "] [" + l + "] ?");
                nums[k][l] = sc.nextInt();
            }
        }

        for (int k = 0; k < nums.length; k++){
            for (int l = 0; l < nums[k].length; l++){
                System.out.print(nums[k][l] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
