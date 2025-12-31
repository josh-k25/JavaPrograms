package strings;
import java.util.Scanner;

public class StringComparisonPractice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first word: ");
        String word1 = sc.nextLine();
        System.out.println("Enter second word: ");
        String word2 = sc.nextLine();

        System.out.print("Exact match: ");
        if (word1.equals(word2)){
            System.out.println("True");
        } else {
            System.out.println("False");
        }

        System.out.print("Ignore case match: ");
        if (word1.equalsIgnoreCase(word2)){
            System.out.println("True");
        } else {
            System.out.println("False");
        }

        sc.close();

    }
}
