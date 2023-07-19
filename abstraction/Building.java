package arman.abstraction;

public abstract class Building {
    private int floors;
    private String address;

    public Building(int floor, String address) {
        this.floors = floor;
        this.address = address;
    }

    public int getFloors() {
        return floors;
    }

    public String getAddress() {
        return address;
    }

    public abstract void Info();
}