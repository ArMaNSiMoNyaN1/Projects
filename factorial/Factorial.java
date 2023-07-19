package arman.factorial;

public class Factorial {
    public static void main(String[] args) {
        System.out.print(factorial(5));
    }

    static int factorial(int number) {
        int fact = 1;
        for (int i = 1; i <= number; i++) {
            fact = fact * i;
        }
        return fact;
    }
}

