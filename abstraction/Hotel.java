package arman.abstraction;

public class Hotel extends Building {
    private int rooms;
    private int stuff;
    private int clients;

    public Hotel(int rooms, int stuff, int clients, int floor, String address) {
        super(floor, address);
        this.rooms = rooms;
        this.stuff = stuff;
        this.clients = clients;
    }

    public int getRooms() {
        return rooms;
    }

    public int getStuff() {
        return stuff;
    }

    public int getClients() {
        return clients;
    }

    @Override
    public void Info() {
        System.out.print("Rooms - " + this.getRooms() + " Stuff - " + this.getStuff() + " Clients - " + this.getClients() + " Floors - " + this.getFloors() + " Address of hotel - " + this.getAddress());
    }
}