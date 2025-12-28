package methods;
import java.util.Scanner;

public class MethodsPractice {
    static int square(int x){//method must remain outside of main but inside of class
        return x * x;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What is your number you'd like to square?");
        int n = sc.nextInt();

        int result = square(n);

        System.out.println("Square: " + result);
        sc.close();
    }
}
