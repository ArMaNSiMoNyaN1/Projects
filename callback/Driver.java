package arman.callback;

public class Driver implements OnBreakListener {
    String name;
    String surname;

    public Driver(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public void Stop() {
        System.out.println("\n" + "The driver stops the bus");
    }

    @Override
    public void Break() {
        Stop();
    }
}
