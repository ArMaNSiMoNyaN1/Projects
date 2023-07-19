package arman.sport;

public class Human {
    public String name;
    public String surName;
    public int age;
    public boolean isFeMale;
    public String nationality;
    public int weight;
    public String religion;
    public Flot flot;


    public Human(String name, int age, boolean isFeMale, int weight) {
        this.name = name;
        this.age = age;
        this.isFeMale = isFeMale;
        this.weight = weight;
    }
}

//public Human(String name,String surName,int age,
//             boolean isFeMale,int weight) {
//        this(name,age,isFeMale,weight);
//        this.surName=surName;
//
//    }
//
//    public Human(String name, String surName, int age,
//                 boolean isFeMale, int weight,) {
//        this(name,surName, age, isFeMale, weight);
//        this.nationality = nationality;
//    }
//
//public Human(String name,String surName,int age,boolean isFeMale,
//             int weight,String nationality,String religion) {
//        this (name,surName,age,isFeMale,weight,nationality);
//        this religion=religion;
//}
//    public Human(String name, String surName, int age, boolean isFeMale,
//                 int weight,String religion,Flot flot) {
//        this(name, surName, age, isFeMale, weight, nationality,religion);
//        this.flot=flot;
//    }
//
//    public void printHumaninfo() {
//       System.out.printf("name=%s,\\n surName = %s, \\n age = %d, \\n isFemale = %b, \\n weight = %d, \\n nationality = %s, \\n religion = %s \\n flat = %s \\n\"," + "\n" +
//               "name, surName, age, isFeMale, weight, nationality, religion, flat.address");
//
//    }
//    public static void main(String[] args) {
//        Human human=new Human("Vzgo","Sahakyan",44,false,78,"Armenian",
//                "Qristonya", new Flot("Yerevan"));
//        human.printHumaninfo();
//    }
//}
