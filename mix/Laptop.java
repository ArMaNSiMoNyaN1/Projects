package arman.mix;

public class Laptop extends Telephone {
    boolean camera;

    public Laptop(boolean camera, String brand, String model, String color) {
        super(brand, model, color);
        this.camera = camera;
    }

    public boolean getCamera() {
        return camera;
    }

    @Override
    public void Charge() {
        System.out.println("\n" + "Brand of laptop - " + this.getBrand() + " Model of laptop - " + getModel() + " Color of laptop - " + getColor() + " Camera of laptop - " + getCamera() + "\n" + "Laptop is charging");
    }
}