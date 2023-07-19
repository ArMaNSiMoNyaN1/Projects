package arman.callback2;

public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        Buldog buldog = new Buldog(person);
        buldog.bark();
    }
}
