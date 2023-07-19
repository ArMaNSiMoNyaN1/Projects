package arman.building;

public class Building {
    private int floors;
    private String address;

    public Building(int floors, String address) {
        this.floors = floors;
        this.address = address;
    }

    public int getFloors() {
        return floors;
    }

    public String getAddress() {
        return address;
    }
    public void Info(){
        System.out.println("Floors of building - " + this.getFloors() + " Address of this building - " + this.getAddress());
    }
}