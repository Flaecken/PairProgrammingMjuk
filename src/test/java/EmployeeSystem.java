import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class EmployeeSystem {

    @Test
    @DisplayName("Checking method for firstName")
    void checkSetFunctionWithGetForFirstName() {
        Employee testObject = new Employee("Stefan","Nikolic",28);     // Test Code
        String expected = "Stefan";         // Test Code
        testObject.setFirstName("Stefan");         // Test Code
        String actual = testObject.getFirstName();         // CUT
        Assertions.assertEquals(expected, actual);          // Assertions
    }

    @Test
    @DisplayName("Checking method for lastName")
    void checkSetFunctionWithGetForLastName() {
        Employee testObject = new Employee("Jolin","Franzke",22);     // Test Code
        String expected = "Jolin";         // Test Code
        testObject.setLastName("Jolin");         // Test Code
        String actual = testObject.getLastName();         // CUT
        Assertions.assertEquals(expected, actual);          // Assertions
    }

    @Test
    @DisplayName("Checking method for age")
    void checkSetFunctionWithGetForAge() {
        Employee testObject = new Employee("Jeff","Jeffson", 24);
        int expected = 24;
        testObject.setAge(24);
        int actual = testObject.getAge();
        Assertions.assertEquals(expected, actual);
    }

    //TODO -- EmployeeCompanyID

    //fixme
    // -- Kolla angående EmployeeCompanyID - tyda korrekt metod.
    // -- I klassen Employee
    // -- Försöka få fram Jeff Jeffson mer som testperson, för han e boss.
    /*
    @Test
    @DisplayName("Checking function for EmployeeCompanyID")
    void checkEmployeeCompanyID() {
        //Random object för Unikt id?
        //Varje anställd ska ha en SLUMPMÄSSIGT ide (Random?).
        Employee testObject = new Employee("Stina","Sigurd",60);
        int expected = 505;
        testObject.getCompanyID();
    } */

    @Test
    @DisplayName("Check function monthlySalary")
    void getMonthlySalary() {
        Employee testObject = new Employee("Jeff","Jeffson",24,25000.12);

    }
}
