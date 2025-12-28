package arrays;
import java.util.Scanner;

public class ArrayWithInputPractice {
    public static void main(String[] args) {
        int[] nums = new int[5];

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < nums.length; i++) {
            System.out.println("Enter number " + (i + 1) + ": ");
            int n = sc.nextInt();
            nums[i] = n;
        }
        sc.close();

        System.out.println("You entered: ");
        for (int j = 0; j < nums.length; j++) {
            System.out.println(nums[j]);
        }

        int sum = 0; //initialize sum
        for (int k = 0; k < nums.length; k++){
            sum += nums[k]; //add the elements of nums to sum
        }

        System.out.println("Sum: " + sum);
    }
}