package methods;

public class ParameterPassingPractice {
    static void doubleValue(int x){
        int j = 2 * x;
        System.out.println("Inside method: " + j);
    }

    public static void main(String[] argv) {
        int n = 5;
        doubleValue(n);
        System.out.println("After method call: " + n);

    }
}
