package arman.callback2;

public class Person implements OnBarkListener {
    public void run() {
        System.out.println("I am running");
    }

    @Override
    public void onDogBarked() {
        run();
    }
}