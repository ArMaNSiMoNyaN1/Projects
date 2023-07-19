package arman.classwork;

public abstract class Sport {
    private String name;
   private boolean isTeam;
   abstract void play(OnStartPlayListener onStartPlayListener);

    public Sport(String name, boolean isTeam) {
        this.name = name;
        this.isTeam = isTeam;
    }

    public String getName() {
        return name;
    }

    public boolean isTeam() {
        return isTeam;
    }
}
