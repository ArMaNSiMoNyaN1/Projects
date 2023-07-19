package arman.callback3;

public class Teacher implements OnStudentListener {
    private String name;
    private String surname;
    private int age;

    public Teacher(String name, String surname, int age) {
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

    public void Call() {
        System.out.println("The student of number 2 of the notebook will answer the lesson");
    }

    @Override
    public void Listen() {
        Call();
    }
}
