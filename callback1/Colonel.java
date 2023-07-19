package arman.callback1;

public class Colonel implements OnCommandListener {
    private String name;
    private String surname;
    private int age;
    private int medal;

    public Colonel(String name, String surname, int age, int medal) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.medal = medal;
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

    public void Order() {
        System.out.println("Colonel - Stand the platoon in a single row!");
    }

    @Override
    public void Command() {
        Order();
    }
}
