package JavaPracticePrograms.arrays;

public class ArrayPassToMethodPractice {
    static void doubleFirstElement(int[] poop){
        poop[0] = poop[0] * 2;
    }

    public static void main(String[] args) {
        int[] arr = {5, 10, 15, 20};
        doubleFirstElement(arr);

        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
