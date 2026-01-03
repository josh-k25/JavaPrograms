package JavaPracticePrograms.strings;
import java.util.Scanner;

public class StringsPractice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word:");
        String word = sc.nextLine(); //nextLine for string input

        int length = word.length();//length of word
        char first = word.charAt(0);//first char
        char last = word.charAt(length - 1);//last char
        System.out.println("Length: " + length);
        System.out.println("First: " + first);
        System.out.println("Last: " + last);

        sc.close();
    }
}
