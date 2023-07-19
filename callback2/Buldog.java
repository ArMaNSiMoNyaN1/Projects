package arman.callback2;

public class Buldog {
    private OnBarkListener l;

    public void bark() {
        System.out.println("Haf haf");
        if (l != null) {
            l.onDogBarked();
        }
    }
    public Buldog(OnBarkListener l) {
        this.l = l;
    }
}