package arman.laptop;

public class Processor {
    private String model;
    private int size;
    private int speed;
    private int generation;

    public Processor(String model, int size, int speed, int generation) {
        this.model = model;
        this.size = size;
        this.speed = speed;
        this.generation = generation;
    }

    public String getModel() {
        return model;
    }

    public int getSize() {
        return size;
    }

    public int getSpeed() {
        return speed;
    }

    public int getGeneration() {
        return generation;
    }

}
