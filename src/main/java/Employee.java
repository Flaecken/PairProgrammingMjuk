public class Employee {

    private String firstName;
    private String lastName;
    private int age;
    //Kanske standardvariabel här med Unik ID?

    public Employee(String fn, String ln, int a) {
        this.firstName = fn;
        this.lastName = ln;
        this.age = a;
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

    public void getCompanyID() {
        //Kanske metod som ger ID efter man instansierar objektet?
    }
}
