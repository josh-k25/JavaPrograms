package JavaPracticePrograms.files;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileCountPractice {
    public static void main(String[] args) throws FileNotFoundException{
        File file = new File("input.txt");
        Scanner scLines = new Scanner(file);
        Scanner scWords = new Scanner(file);

        int lineCount = 0;
        while (scLines.hasNextLine()){
            scLines.nextLine();
            lineCount++;
        }

        int wordCount = 0;

        while (scWords.hasNext()){
            String token = scWords.next();
            wordCount++;
        }

        System.out.println("Lines: " + lineCount);
        System.out.println("Words: " + wordCount);

        scLines.close();
        scWords.close();

    }
}
