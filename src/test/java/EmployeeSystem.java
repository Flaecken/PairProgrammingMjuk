import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class EmployeeSystem {

    @Test
    @DisplayName("Checking method for firstName")
    void checkSetFunctionWithGetForFirstName() {
        Employee testObject = new Employee("Stefan", "Nikolic", 28, 23331.2);     // Test Code
        String expected = "Stefan";         // Test Code
        testObject.setFirstName("Stefan");         // Test Code
        String actual = testObject.getFirstName();         // CUT
        Assertions.assertEquals(expected, actual);          // Assertions
    }

    @Test
    @DisplayName("Checking method for lastName")
    void checkSetFunctionWithGetForLastName() {
        Employee testObject = new Employee("Jolin", "Franzke", 22, 24455.72);     // Test Code
        String expected = "Jolin";         // Test Code
        testObject.setLastName("Jolin");         // Test Code
        String actual = testObject.getLastName();         // CUT
        Assertions.assertEquals(expected, actual);          // Assertions
    }

    @Test
    @DisplayName("Checking method for age")
    void checkSetFunctionWithGetForAge() {
        Employee testObject = new Employee("Jeff", "Jeffson", 24, 25000.1);
        int expected = 24;
        testObject.setAge(24);
        int actual = testObject.getAge();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Checking function for EmployeeCompanyID")
    void getUniqueID() {
        Employee testObject = new Employee("Stina", "Sigurd", 60, 25000);
        Employee testObject2 = new Employee("Olof", "Sigurd", 20, 24552);
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
        Employee testObject = new Employee("Jeff", "Jeffson", 24, 25000.1);
        double expected = 25000.1;
        double actual = testObject.getMonthlySalary();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Check method if an Employee has been added to the arraylist.")
    void checkIfAddEmployeeArray() {
        EmployeeList testObject = new EmployeeList();
        Employee emp = new Employee("Jolin", "Franzke", 22, 33000.75);
        Employee emp2 = new Employee(null, null, 0, 0);
        testObject.addEmployeeToList(emp);
        testObject.addEmployeeToList(emp2);
        testObject.removeEmployeeFromList(emp2);
        Assertions.assertEquals(emp, testObject.getEmployee(emp.getUniqueCompanyID()));
        Assertions.assertNull(testObject.getEmployee(emp2.getUniqueCompanyID()));
    }

    @Test
    @DisplayName("Check method if an Employee has been removed from the arraylist.")
    void checkIfRemoveEmployee() {
        EmployeeList testObject = new EmployeeList();
        Employee emp = new Employee("Stefan", "Nikolic", 28, 33000.74);
        Employee emp1 = new Employee("Jeff", "Jeffson", 24, 23000.75);
        Employee emp2 = new Employee("Jolin", "Franzke", 22, 33000.75);
        testObject.addEmployeeToList(emp);
        testObject.addEmployeeToList(emp1);
        testObject.addEmployeeToList(emp2);
        testObject.removeEmployeeFromList(emp);
        int expected = 2;
        int actual = testObject.checkArray();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Check method raise ALL salary of Employee in list.")
    void raiseEverySalaryFromEmployeeList() {
        EmployeeList list = new EmployeeList();
        Employee emp = new Employee("Stefan","Nikolic",28,33000);
        Employee emp1 = new Employee("Jeff","Jeffson",24,23000);
        Employee emp2 = new Employee("Jolin","Franzke",22,34000);
        list.addEmployeeToList(emp);
        list.addEmployeeToList(emp1);
        list.addEmployeeToList(emp2);
        list.raiseEveryEmployeesSalary(10);
        //Check to see if the raised salaries has been unchanged when input -10.
        list.raiseEveryEmployeesSalary(-10);
        double expected1 = 36300;
        double expected2 = 25300;
        double expected3 = 37400;
        Assertions.assertEquals(expected1, list.getEmployee(1).getMonthlySalary());
        Assertions.assertEquals(expected2, list.getEmployee(2).getMonthlySalary());
        Assertions.assertEquals(expected3, list.getEmployee(3).getMonthlySalary());
    }

    @Test
    @DisplayName("Check method for raising a specific Employee from EmployeeList")
    void checkSpecificRaiseEmployeeFromList() {
        EmployeeList list = new EmployeeList();
        Employee emp = new Employee("Stefan","Nikolic",28,33000);
        Employee emp1 = new Employee("Jeff","Jeffson",24,23000);
        list.addEmployeeToList(emp);
        list.addEmployeeToList(emp1);
        list.raiseSpecificEmployeeSalary(1,10);
        //Check next to see whether the salary has been raised by 10%.
        double expected1 = 36300;
        //Check next to see whether salary is unchanged.
        double expected2 = 23000;
        Assertions.assertEquals(expected1, list.getEmployee(1).getMonthlySalary());
        Assertions.assertEquals(expected2, list.getEmployee(2).getMonthlySalary());
    }
}

/* This test was created just to check the Employee class manually without ArrayList.
    @Test
    @DisplayName("Check method raise an Employee's salary FROM Employee-class")
    void raiseEmployeeSalary() {
        Employee emp1 = new Employee("Stefan", "Nikolic", 28, 33000);
        Employee emp2 = new Employee("Jeff", "Jeffson", 24, 23000);
        Employee emp3 = new Employee("Jolin", "Franzke", 22, 33000);
        double expected1 = 36300;
        double expected2 = 25300;
        //Testar felmeddelanden
        double expectedError = 33000;
        emp1.raiseMonthlySalary(10);
        emp2.raiseMonthlySalary(10);
        emp3.raiseMonthlySalary(-10);
        double actual1 = emp1.getMonthlySalary();
        double actual2 = emp2.getMonthlySalary();
        double actual3 = emp3.getMonthlySalary();
        Assertions.assertEquals(expected1, actual1);
        Assertions.assertEquals(expected2, actual2);
        Assertions.assertEquals(expectedError, actual3);
        Assertions.assertNotEquals(expected1, actual3);
    }
    */