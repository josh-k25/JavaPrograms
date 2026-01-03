package JavaPracticePrograms.methods;

public class ReturnValuePractice {
    static int doubleValue(int x){
        return x * 2;
    }
    public static void main(String[] args) {
        int n = 5;
        int result = doubleValue(n);
        System.out.println("After method call: " + result);
    }
}
