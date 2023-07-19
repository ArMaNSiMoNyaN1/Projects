package arman.mix;

public class Telephone {
    String brand;
    String model;
    String color;

    public Telephone(String brand, String model, String color) {
        this.brand = brand;
        this.model = model;
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public void Charge() {
        System.out.print("Brand of telephone - " + getBrand() + " Model of telephone - " + getModel() + " Color of telephone - " + getColor() + "\n" + "Phone is charging");
    }
}