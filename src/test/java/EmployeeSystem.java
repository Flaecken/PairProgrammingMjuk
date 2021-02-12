import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class EmployeeSystem {

    @Test
    @DisplayName("Checking method for firstName")
    void checkSetFunctionWithGetForFirstName() {
        Employee testObject = new Employee("Stefan","Nikolic",28, 23331.2);     // Test Code
        String expected = "Stefan";         // Test Code
        testObject.setFirstName("Stefan");         // Test Code
        String actual = testObject.getFirstName();         // CUT
        Assertions.assertEquals(expected, actual);          // Assertions
    }

    @Test
    @DisplayName("Checking method for lastName")
    void checkSetFunctionWithGetForLastName() {
        Employee testObject = new Employee("Jolin","Franzke",22, 24455.72);     // Test Code
        String expected = "Jolin";         // Test Code
        testObject.setLastName("Jolin");         // Test Code
        String actual = testObject.getLastName();         // CUT
        Assertions.assertEquals(expected, actual);          // Assertions
    }

    @Test
    @DisplayName("Checking method for age")
    void checkSetFunctionWithGetForAge() {
        Employee testObject = new Employee("Jeff","Jeffson", 24, 25000.1);
        int expected = 24;
        testObject.setAge(24);
        int actual = testObject.getAge();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Checking function for EmployeeCompanyID")
    void getUniqueID() {

        Employee testObject = new Employee("Stina","Sigurd",60, 25000.1);
        Employee testObject2 = new Employee("Olof","Sigurd",20, 24552.2);
        int expected = 1;
        int expected2 = 2;
        int actual = testObject.getUniqueCompanyID();
        int actual2 = testObject2.getUniqueCompanyID();
        Assertions.assertEquals(expected, actual);
        Assertions.assertEquals(expected2, actual2);
    }

    @Test
    @DisplayName("Check function monthlySalary")
    void getMonthlySalary() {
        Employee testObject = new Employee("Jeff","Jeffson",24,25000.1);
        double expected = 25000.1;
        double actual = testObject.getMonthlySalary();
        Assertions.assertEquals(expected,actual);
    }

    @Test
    @DisplayName("Check method if an Employee has been added to the arraylist.")
    void checkIfAddEmployeeArray() {
        EmployeeList testObject = new EmployeeList();
        Employee emp = new Employee("Jolin","Franzke",22,33000.75);
        Employee emp2 = new Employee(null,null,0,0);
        testObject.addEmployeeToList(emp);
        testObject.addEmployeeToList(emp2);
        testObject.removeEmployeeFromList(emp2);
        Assertions.assertEquals(emp,testObject.getEmployee(emp.getUniqueCompanyID()));
        Assertions.assertNull(testObject.getEmployee(emp2.getUniqueCompanyID()));
    }

    @Test
    @DisplayName("Check method if an Employee has been removed from the arraylist.")
    void checkIfRemoveEmployee() {
        EmployeeList testObject = new EmployeeList();
        Employee emp = new Employee("Stefan","Nikolic",28,33000.74);
        Employee emp1 = new Employee("Jeff","Jeffson",24,23000.75);
        Employee emp2 = new Employee("Jolin","Franzke",22,33000.75);
        testObject.addEmployeeToList(emp);
        testObject.addEmployeeToList(emp1);
        testObject.addEmployeeToList(emp2);
        testObject.removeEmployeeFromList(emp);
        int expected = 2;
        int actual = testObject.checkArray();
        Assertions.assertEquals(expected, actual);
    }
}
