package arman.facebook;

public class FacebookUser {
    private String name;
    private String surName;
    private int age;
    private String email;
    private String country;
    private int phoneNumber;

    public FacebookUser(String name, String surName, int age, String email) {
        this.name = name;
        this.surName = surName;
        setAge(age);
        this.email=email;
    }

    public FacebookUser(String name, String surName, int age, int phonenumber) {
        this.name = name;
        this.surName = surName;
        setAge(age);
        this.phoneNumber = phonenumber;
    }

    public FacebookUser(String name, String surName, int age, String email, String country) {
        this(name, surName, age, email);
        this.country = country;
    }

    public FacebookUser(String name, String surName, int age, int phoneNumber, String country) {
        this(name, surName, age, phoneNumber);
        this.country = country;
    }

    public FacebookUser(String name, String surName, int age, String email, int phoneNumber) {
        this(name, surName, age, email);
        this.phoneNumber = phoneNumber;
    }

    public FacebookUser(String name, String surName, int age, String email, String country, int phoneNumber) {
        this(name, surName, age, email, phoneNumber);
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String SurName) {
        this.surName = surName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 18)
            this.age = age;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email=email;
    }
    public int getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(int PhoneNumber) {
         this.phoneNumber=phoneNumber;
    }
    public String getCountry() {
        return country;
    }
    public void setCountry(String country) {
        this.country=country;
    }
    public boolean isBiggerEighteen() {
        return age>=18;
    }
}
