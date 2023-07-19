package arman.calculator;

public class Calculator implements Calculate {
    @Override
    public int sum(int a, int b) {
        return a + b;
    }

    @Override
    public int difference(int a, int b) {
        return a - b;
    }

    @Override
    public int multiplication(int a, int b) {
        return a * b;
    }

    @Override
    public int separation(int a, int b) {
        return a / b;
    }
}
