import java.util.ArrayList;

public class EmployeeList {

    ArrayList<Employee> listOfEmployees = new ArrayList<Employee>();

    public void addEmployeeToList(Employee emp) {
        listOfEmployees.add(emp);
    }

    public Employee getEmployee(int companyID) {
        for (int i = 0; i < listOfEmployees.size(); i++) {
            if (listOfEmployees.get(i).getUniqueCompanyID() == companyID) {
                listOfEmployees.get(i).getUniqueCompanyID();
                System.out.println(listOfEmployees.size());
                return listOfEmployees.get(i);
            }
        }
        System.out.println("Couldn't find any employee");
        return new Employee(null,null,0,0);
    }

    public int checkArray() {
        int checkSize = listOfEmployees.size();
        System.out.println(checkSize);
        return checkSize;
    }

    /* public Employee checkArray(int companyID) {
        for (int i = 0; i < listOfEmployees.toArray().length; i++) {
            if (listOfEmployees.get(i).getUniqueCompanyID() == companyID) {
                listOfEmployees.get(i).getUniqueCompanyID();
                System.out.println(listOfEmployees.toArray().length);
                return listOfEmployees.get(i);
            }
        }
        System.out.println("Error.");
        return new Employee(null, null, 0, 0);
    } */

    public void removeEmployeeFromList(Employee emp) {
        listOfEmployees.remove(emp);
    }
}
