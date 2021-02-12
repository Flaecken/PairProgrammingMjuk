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
        System.out.println("Error");
        return null;
    }

    public int checkArray() {
        int checkSize = listOfEmployees.size();
        System.out.println(checkSize);
        return checkSize;
    }

    public void removeEmployeeFromList(Employee emp) {
        listOfEmployees.remove(emp);
    }
}
