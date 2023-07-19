package arman.football;

public class Main {
    private static HomeTeam homeTeam;

    public static void main(String[] args) {
        Refere refere = new Refere("Gevorg", "Ohanyan", 42);
        VisitingTeam visitingTeam = new VisitingTeam(33, 240000, homeTeam);
        HomeTeam homeTeam = new HomeTeam(36, 300000, visitingTeam);
        refere.whistle();
        homeTeam.start();
        refere.violation();
        homeTeam.foul();
        refere.halfTime();
        visitingTeam.start();
        homeTeam.stop();
        refere.stop();
    }
}
