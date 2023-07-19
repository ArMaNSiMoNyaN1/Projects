package arman.building;

public class University extends Building {
    private int group;
    private int audience;
    private int lecturer;
    private int students;

    public University(int group, int audience, int lecturer, int students, int floor, String address) {
        super(floor, address);
        this.group = group;
        this.audience = audience;
        this.lecturer = lecturer;
        this.students = students;
    }

    public int getGroup() {
        return group;
    }

    public int getAudience() {
        return audience;
    }

    public int getLecturer() {
        return lecturer;
    }

    public int getStudents() {
        return students;
    }

    @Override
    public void Info() {
        System.out.println("Groups - " + this.getGroup() + " Audience - " + this.getAudience() + " Lecturer - " + this.getLecturer() + " Students - " + this.getStudents() + " Floors - " + this.getFloors() + " Address of university - " + this.getAddress());
    }
}