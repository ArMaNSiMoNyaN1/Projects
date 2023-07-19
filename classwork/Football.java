package arman.classwork;

public class Football extends Sport{
   public Football(String name, boolean isTeam) {
       super("Football", isTeam);
   }

    @Override
    void play(OnStartPlayListener onStartPlayListener) {
        System.out.println("Football is palying" + isTeam());
    }
}
