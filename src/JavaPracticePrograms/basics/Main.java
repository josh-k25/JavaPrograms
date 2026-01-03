import java.util.Scanner; //Import scanner

public class Main {
    public static void main(String[] args){
        System.out.println("Hello, world!"); //type "sout" and tab to
        int year = 2025; //variable declerations
        double gpa = 3.7;
        boolean isStudent = true;
        String name = "Josh";
        System.out.println("Year: " + year); //println automatically prints a new line
        System.out.println("GPA: " + gpa);
        System.out.println("T/F: " + isStudent);
        System.out.println("Name: " + name);

        Scanner sc = new Scanner(System.in); //scanner is called sc
        System.out.println("What is your name?");
        String name2 = sc.nextLine();
        System.out.println("What is your age?");
        int age = sc.nextInt();// age is next int

        System.out.println("Hello, " + name2 + " you are " + age + " years old.");

        if (age >= 65){
            System.out.println("You are a senior.");
        } else if (age >= 18){
            System.out.println("You are an adult.");
        } else if (age >= 13){
            System.out.println("You are a teen");
        } else {
            System.out.println("You are a child");
        }

        System.out.println("Do you have ID? (enter true or false)"); //make sure to print the prompt first and then have the scan after
        boolean hasID = sc.nextBoolean();
        if (age >= 18 && hasID){
            System.out.println("You may enter.");
        } else {
            System.out.println("Entry denied.");
        }
    }
}