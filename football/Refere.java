package arman.football;

public class Refere {
    private String name;
    private String surname;
    private int age;

    public Refere(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public void whistle() {
        System.out.println("The mach has started");
    }

    public void violation() {
        System.out.println("A violaton has occured");
    }

    public void halfTime() {
        System.out.println("The match 2th half time started");
    }

    public void stop() {
        System.out.println("\n" + "The match ended in favor of the home team with a score of 4-3");
    }
}
