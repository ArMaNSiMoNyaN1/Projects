package arman.callback3;

public class Student {
    private String name;
    private String surname;
    private int age;
    private int number;
    private Course c;

    public Student(String name, String surname, int age, int number, Course c) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.number = number;
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

    public int getNumber() {
        return number;
    }

    public Course getC() {
        return c;
    }

    public void Tell() {
        System.out.print("The student started tell a lesson");
        if (c != null)
            c.Listen();
    }
}
