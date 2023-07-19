package arman.laptop;

public class Ram {
    private String model;
    private int memory;
    private String brand;

    public Ram(String model, int memory, String brand) {
        this.model = model;
        this.memory = memory;
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public int getMemory() {
        return memory;
    }

    public String getBrand() {
        return brand;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

}
