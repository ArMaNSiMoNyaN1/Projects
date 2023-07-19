package arman.mix;

public class Tablet extends Telephone {
    boolean pen;

    public Tablet(boolean pen, String brand, String model, String color) {
        super(brand, model, color);
        this.pen = pen;
    }

    public boolean getPen() {
        return pen;
    }

    @Override
    public void Charge() {
        System.out.println("Brand of tablet - " + getBrand() + " Model of  tablet - " + getModel() + " Color of tablet - " + getColor() + " Pen of tablet - " + getPen() + "\n" + "Tablet is charging");
    }
}