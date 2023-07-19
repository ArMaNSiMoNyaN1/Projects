package arman.football;

public class VisitingTeam implements OnWhistleListener {
    private int players;
    private int fun;
    private HomeTeam h;


    public VisitingTeam(int players, int fun, HomeTeam h) {
        this.players = players;
        this.fun = fun;
        this.h = h;
    }

    public int getPlayers() {
        return players;
    }

    public int getFun() {
        return fun;
    }

    public HomeTeam getH() {
        return h;
    }

    public void defend() {
        System.out.println("The visiting team started to defend");
    }

    @Override
    public void OnRefereeWhistle() {
        defend();
    }

    public void injury() {
        System.out.println("\n" + "The player of number 8 has been injured");
    }

    @Override
    public void OnRefereeWhistle1() {
        injury();
    }


    public void start() {
        System.out.println("Visiting team started 2th half time");
        if (h != null) {
            h.OnRefereeWhistle2();
        }
    }

    @Override
    public void OnRefereeWhistle2() {
        start();
    }

    public void stop() {
        System.out.print("The match over");
    }

    @Override
    public void OnRefereeWhistle3() {
        stop();

    }
}
