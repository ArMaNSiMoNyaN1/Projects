package arman.callback3;

public class Course implements OnStudentListener {
    private int human;

    public Course(int human) {
        this.human = human;
    }

    public void Course() {
        System.out.println("\n" + "The course listens to a classmate narrate a lesson");
    }

    @Override
    public void Listen() {
        Course();
    }
}
