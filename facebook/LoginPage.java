package arman.facebook;

import java.util.Objects;
import java.util.Scanner;

import static arman.facebook.Facebook.isUserExists;

public class LoginPage {
    private String email;
    private int phoneNumber;
    private Scanner scanner = new Scanner(System.in);

    private void setEmail() {
        System.out.println("Please write your Email");
        this.email = scanner.next();
        if (Objects.equals(email,"")) {
            System.out.println("Your email is empty");
            setEmail();
        }
    }

    private void setPhoneNumber() {
        System.out.println("Please write your number");
        this.phoneNumber = scanner.nextInt();
        if (phoneNumber == 0) {
            System.out.println("Your phone number is invalid");
            setPhoneNumber();
        }
    }

    public boolean login(boolean isWhiteEmail) {
        if (isWhiteEmail) {
            setEmail();
           return isUserExists(email);
        } else {
            setPhoneNumber();
            return isUserExists(phoneNumber);
        }
    }
}
