package arman.classwork;

public class HorseRacing extends Sport{
    public HorseRacing() {
        super("HorseRacing", false);
    }

    @Override
    void play(OnStartPlayListener onStartPlayListener) {
        System.out.println("Horse Racing is playing");
        if (onStartPlayListener!=null){
            onStartPlayListener.startPlay();
        }
    }
}
