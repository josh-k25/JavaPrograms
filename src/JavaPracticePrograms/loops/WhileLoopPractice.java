import java.util.Scanner;

public class WhileLoopPractice {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("What is your number n?");
        int n = sc.nextInt();

        int i = 1;

        while (i <= n){ //must user <= so it prints all the numbers up to and uncluding n
            System.out.println(i);
            i++;
        }
        sc.close();
    }
}
