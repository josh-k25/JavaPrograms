package JavaPracticePrograms.arrays;

public class JavaPracticePrograms {
    public static int[] doubledArray(int[] x){
        int[] z = new int[x.length];

        for (int j = 0; j < x.length; j++){
            z[j] = x[j] * 2;
        }

        return z;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};

        int[] doubled = doubledArray(arr);

        System.out.print("Doubled: ");
        for (int i = 0; i < doubled.length; i++){
            System.out.print(doubled[i] + " ");

        }


    }
}
