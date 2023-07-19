package arman.polymorphism;

public class Sum {

    public void add(int a, int b) {
        int result = a + b;
        System.out.println("Result - " + result);
    }

    public void add(int a, int b, int c) {
        int result = a + b + c;
        System.out.println("Result - " + result);
    }

    public static void main(String[] args) {
        Sum sum = new Sum();
        sum.add(10, 20);
        sum.add(10, 20, 30);
    }
}
