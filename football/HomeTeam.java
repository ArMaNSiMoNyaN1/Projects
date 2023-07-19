package arman.football;

public class HomeTeam implements OnWhistleListener {
    private int players;
    private int fan;
    private VisitingTeam v;

    public HomeTeam(int players, int fan, VisitingTeam v) {
        this.players = players;
        this.fan = fan;
        this.v = v;
    }

    public int getPlayers() {
        return players;
    }

    public int getFan() {
        return fan;
    }

    public VisitingTeam getV() {
        return v;
    }

    public void start() {
        System.out.println("Home team started the match");
        if (v != null) {
            v.OnRefereeWhistle();
        }
    }

    public void foul() {
        System.out.print("The player of home team fouled");
        if (v != null) {
            v.OnRefereeWhistle1();
        }
    }

    public void defend() {
        System.out.println("The home team started to defend");
    }

    public void stop() {
        System.out.print("The match over");
        if (v != null) {
            v.OnRefereeWhistle3();
        }
    }

    @Override
    public void OnRefereeWhistle() {
        start();
    }

    @Override
    public void OnRefereeWhistle1() {
        foul();
    }

    @Override
    public void OnRefereeWhistle2() {
        defend();
    }

    @Override
    public void OnRefereeWhistle3() {
        stop();
    }
}

