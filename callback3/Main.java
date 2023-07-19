package arman.callback3;

public class Main {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Lilit", "Harutyunyan", 24);
        Course course = new Course(15);
        Student student = new Student("Gor", "Sargsyan", 17, 7, course);
        teacher.Call();
        student.Tell();
    }
}
