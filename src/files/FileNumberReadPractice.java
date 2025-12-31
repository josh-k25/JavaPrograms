package files;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileNumberReadPractice {
    public static void main(String[] args) throws FileNotFoundException {
         File file = new File("numbers.txt");
         Scanner sc = new Scanner(file);


         int total = 0;
         while (sc.hasNextInt()){
             int num = sc.nextInt();
             System.out.println(num);
             total += num;
         }
        System.out.println("Sum: " + total);

         sc.close();

    }
}
