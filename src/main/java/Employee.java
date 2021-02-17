public class Employee {

    private String firstName;
    private String lastName;
    private int age;
    private double monthlySalary;
    private static int companyID = 0;
    private int correctID;

    public Employee(String fn, String ln, int a, double m) {
        this.firstName = fn;
        this.lastName = ln;
        this.age = a;
        this.monthlySalary = m;
        companyID++;
        this.correctID = companyID;
    }

    public void setFirstName(String fn) {
         this.firstName = fn;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String ln) {
        this.lastName = ln;
    }

    public String getLastName() {
        return lastName;
    }

    public void setAge(int a) {
        this.age = a;
    }

    public int getAge() {
        return age;
    }

    public int getUniqueCompanyID() {
        return correctID;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public void raiseMonthlySalary(double raiseProcent) {

        if(raiseProcent >= 0 && raiseProcent <= 100) {
            double newSalary = (monthlySalary/raiseProcent)+monthlySalary;
            monthlySalary = newSalary;
        }
    }
}