package arman.calculator;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println("Sum = " + calculator.sum(50,60));
        System.out.println("Difference = " + calculator.difference(4,0));
        System.out.println("Multiplication = " + calculator.multiplication(5,23));
        System.out.println("Separation = " + calculator.separation(56,8));
    }
}
