package arman.callback;

public class Bus  {
    private String brand;
    private String model;
    private int seat;
    private OnBreakListener b;

    public Bus(String brand, String model, int seat, OnBreakListener b) {
        this.brand = brand;
        this.model = model;
        this.seat = seat;
        this.b = b;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getSeat() {
        return seat;
    }


    public void Stop() {
        System.out.print("Brand of bus - " + getBrand() + " Model of bus = " + getModel() + " Seat - " + getSeat() + "\n" + "Break!");
        if (b != null) {
            b.Break();
        }
    }
}
