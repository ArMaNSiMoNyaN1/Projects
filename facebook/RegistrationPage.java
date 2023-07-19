package arman.facebook;

public class RegistrationPage {
 private String name;
 private String surName;
 private int phoneNumber;
 private String email;
 private String password;
 private int birthday;
 private String gender;

 public RegistrationPage(String name, String surName, int phoneNumber, String email, String password) {
     this.name=name;
     this.surName=surName;
     this.phoneNumber=phoneNumber;
     this.email=email;
     this.password=password;
 }

public RegistrationPage(String name, String surName, String email, String gender, int phoneNumber) {
     this.name=name;
     this.surName=surName;
     this.phoneNumber=phoneNumber;
     this.email=email;
     this.gender=gender;
}
public RegistrationPage(String name, String surName,int phoneNumber,String email, String password, int birthday) {
    this(name, surName, phoneNumber, email, password);
    this.birthday = birthday;
}

    public int getBirthday() {
        return birthday;
    }
}
