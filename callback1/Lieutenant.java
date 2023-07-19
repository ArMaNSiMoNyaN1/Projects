package arman.callback1;

public class Lieutenant {
    private String name;
    private String surname;
    private int age;
    private int medal;
    private Platoon c;

    public Lieutenant(String name, String surname, int age, int medal, Platoon c) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.medal = medal;
        this.c = c;
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

    public int getMedal() {
        return medal;
    }

    public Platoon getC() {
        return c;
    }

    public void Bidding() {
        System.out.println("Lieutenant - The platoon will line up in a row!");
        if (c != null) ;
        c.Command();
    }
}
