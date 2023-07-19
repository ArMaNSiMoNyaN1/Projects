package arman.laptop;

public class VideoCard {
    private String brand;
    private String model;
    private String ram;
    private boolean isIntegrated;
    private int temperature;

    public VideoCard(String brand, String model, String ram, boolean isIntegrated) {
        this.brand = brand;
        this.model = model;
        this.ram = ram;
        this.isIntegrated = isIntegrated;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getRam() {
        return ram;
    }

    public  boolean isIntegrated() {
        return isIntegrated;
    }

    public int getTemperature() {
        return temperature;
    }

}

