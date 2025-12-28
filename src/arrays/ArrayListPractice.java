package arrays;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListPractice {
    public static void main(String[] args) {
    ArrayList<Integer> nums = new ArrayList<>(); //initialize array list (use "Integer" instead of int since it is a wrapper and not a primitive
    Scanner sc = new Scanner(System.in);

    for (int i = 0; i < nums.size(); i++){
        System.out.printf("Enter element " + (i + 1) + ": ");
        nums.set(i, sc.nextInt());
    }

    System.out.println("You entered: ");
    for (int j = 0; j < nums.size(); j++){
        System.out.println(nums.get(j));
    }

    int sum = 0;
    for (int k = 0; k < nums.size(); k++){
        sum += nums.get(k);
    }

        System.out.println("The sum is: " + sum);
    }
}
