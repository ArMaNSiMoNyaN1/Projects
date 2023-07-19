package arman.mix;

public class Technique {
    public static void main(String[] args) {
        Telephone telephone = new Telephone("Xiaomi,", "Redmi Note 11,", "Green");
        Laptop laptop = new Laptop(true, "Apple,", "MacBook,", "Grey");
        Tablet tablet = new Tablet(false, "Samsung,", "Galaxy Tab S9,", "Black,");
        telephone.Charge();
        laptop.Charge();
        tablet.Charge();
    }
}
