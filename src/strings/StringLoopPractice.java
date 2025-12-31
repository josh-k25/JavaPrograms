package strings;
import java.util.Scanner;

public class StringLoopPractice {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String word = sc.nextLine();

        int vowelCount = 0;

        for (int i = 0; i < word.length(); i++){
            char c = Character.toLowerCase(word.charAt(i));

            if (c == 'a' || c == 'e'|| c == 'i' || c == 'o' || c == 'u'){
                vowelCount += 1;
            }
        }

        System.out.println("Vowels: " + vowelCount);

        sc.close();
    }
}
