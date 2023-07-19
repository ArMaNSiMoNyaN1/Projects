package arman.abstraction;

public class Hospital extends Building {
    private int doctors;
    private int sick;
    private int sickroom;

    public Hospital(int doctors, int sick, int sickroom, int floor, String address) {
        super(floor, address);
        this.doctors = doctors;
        this.sick = sick;
        this.sickroom = sickroom;
    }

    public int getDoctors() {
        return doctors;
    }

    public int getSick() {
        return sick;
    }

    public int getSickroom() {
        return sickroom;
    }

    @Override
    public void Info() {
        System.out.println("Doctors - " + this.getDoctors() + " Sicks - " + this.getSick() + " Sicks room - " + this.getSickroom() + " Floors - " + this.getFloors() + " Address of hospital - " + this.getAddress());
    }
}