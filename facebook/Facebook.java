package arman.facebook;

import java.util.Objects;

public class Facebook {
    private static FacebookUser[] facebookUsers = new FacebookUser[10];

    public static void addUser(FacebookUser facebookUser) {

    }

    public static boolean isUserExists(String email) {
        for (FacebookUser facebookUser : facebookUsers) {
            if (facebookUser != null && Objects.equals(facebookUser.getEmail(), email)) {
                return true;
            }
        }
        return false;
    }

    public static boolean isUserExists(int phoneNumber) {
        for (FacebookUser facebookUser : facebookUsers) {
            if (facebookUser != null && facebookUser.getPhoneNumber() == phoneNumber) {
                return true;
            }
        }
        return false;
    }
  public LoginPage openLoginPage() {
        return new LoginPage();
    }

    public static void main(String[] args) {
        Facebook facebook = new Facebook();
        facebookUsers[0] = new FacebookUser("", "", 6, 788);
        LoginPage loginPage = facebook.openLoginPage();
        if (loginPage.login(false)) {
            System.out.println("Succesful login");
        } else {
            System.out.println("Login failed");
        }
    }
}















