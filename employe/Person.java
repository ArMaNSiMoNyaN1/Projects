package arman.employe;

public class Person {
    private String name;

    public Person() {
        name = "No name yet.";
    }

    public Person(String n) {
        name = n;
    }

    public void setName(String newName) {
        name = newName;
    }

    public String getName() {
        return  name;
    }
    public void print(){
        System.out.print("Name : " + name);
    }
}