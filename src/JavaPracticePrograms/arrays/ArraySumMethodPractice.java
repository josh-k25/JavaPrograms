package JavaPracticePrograms.arrays;

public class ArraySumMethodPractice {
    public static int sumArray(int[] x) {
        int sum = 0;
        for (int i = 0; i < x.length; i++){
            sum += x[i];
        }

        return sum;
    }

    public static void main(String[] args) {

        int[] arr = {3, 6, 9, 12};

        int sum = sumArray(arr);

        System.out.println("Sum of array: " + sum);
    }
}

