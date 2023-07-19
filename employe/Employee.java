package arman.employe;

public class Employee extends Person {
    private double annualSalary;
    private int yearOfStart;
    private String insuranceNumber;


    public Employee(double annualSalary, int yearOfStart, String insuranceNumber) {
   //     super(name);
        this.annualSalary = annualSalary;
        this.yearOfStart = yearOfStart;
        this.insuranceNumber = insuranceNumber;
    }

    public Employee(double annualSalary, int yearOfStart, String insuranceNumber, String name) {
        this.annualSalary = annualSalary;
        this.yearOfStart = yearOfStart;
        this.insuranceNumber = insuranceNumber;
     //   this.name = name;
    }

    public double getAnnualSalary() {
        return annualSalary;
    }

    public void setAnnualSalary() {
        this.annualSalary = annualSalary;
    }

    public int getYearOfStart() {
        return yearOfStart;
    }

    public void setYearOfStart() {
        this.yearOfStart = yearOfStart;
    }

    public String getInsuranceNumber() {
        return insuranceNumber;
    }

    public void setInsuranceNumber() {
        this.insuranceNumber = insuranceNumber;
    }

}
