package arman;
public class Human2 {
    String name;
    String surname;
    int age;
    int weight;
    int height;
    boolean isMale;
    boolean canWalk = true;


    public static void main(String[] args) {
        Human2 human = new Human2();
        human.printHumanInfo();
    }

    void printHumanInfo() {
        System.out.println("Name of Human is: " + name + "\n" +
                "SurName of human is " + surname);
    }

}