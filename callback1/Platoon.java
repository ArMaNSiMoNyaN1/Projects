package arman.callback1;

public class Platoon implements OnCommandListener {
    private int solider;

    public Platoon(int solider) {
        this.solider = solider;
    }

    public int getSolider() {
        return solider;
    }

    public void lineup() {
        System.out.print("The platoon lined up");
    }

    @Override
    public void Command() {
        lineup();
    }
}
