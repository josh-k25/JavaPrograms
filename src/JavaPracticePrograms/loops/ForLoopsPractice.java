import java.util.Scanner;

public class ForLoopsPractice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("What is your number n?");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++){
            System.out.println(i);
        }

        sc.close();
    }
}
