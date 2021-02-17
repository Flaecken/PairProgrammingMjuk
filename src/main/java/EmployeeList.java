import java.util.ArrayList;

public class EmployeeList {

    ArrayList<Employee> listOfEmployees = new ArrayList<Employee>();

    public void addEmployeeToList(Employee emp) {
        listOfEmployees.add(emp);
    }

    public Employee getEmployee(int companyID) {
        for (int i = 0; i < listOfEmployees.size(); i++) {
            if (listOfEmployees.get(i).getUniqueCompanyID() == companyID) {
                return listOfEmployees.get(i);
            }
        }
        return null;
    }

    public void raiseEveryEmployeesSalary(double raiseSalary) {
        for (int i = 0; i < listOfEmployees.size(); i++) {
            listOfEmployees.get(i).raiseMonthlySalary(raiseSalary);
            }
        }

    public void raiseSpecificEmployeeSalary(int companyID,double raise) {
        for (int i = 0; i < listOfEmployees.size(); i++) {
            if (listOfEmployees.get(i).getUniqueCompanyID() == companyID) {
                listOfEmployees.get(i).raiseMonthlySalary(raise);
            }
        }
    }

        public int checkArray () {
            int checkSize = listOfEmployees.size();
            System.out.println(checkSize);
            return checkSize;
        }

        public void removeEmployeeFromList (Employee emp){
            listOfEmployees.remove(emp);
        }

}
