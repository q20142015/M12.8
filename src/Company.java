import java.util.ArrayList;
import java.util.Collections;

public class Company {

    ArrayList<Employee> Employees = new ArrayList<Employee>();
    int profitCompany = 0;

    int getIncome() {
        for (Employee empl : Employees) {
            if (empl.getClass() == Manager.class) {
                profitCompany += ((Manager) empl).profitForCompany;
            }
        }
        return profitCompany;
    }

    void hire(Employee employee) {
        Employees.add(employee);
    }

    void hireAll(ArrayList<Employee> employees) {
        for (Employee empl : employees) {
            Employees.add(empl);
        }
    }

    void fire() {
        int eL = Employees.size();
        if (eL > 0) {
            int deleteEmp = (int) (Math.random() * (eL - 1));
            Employees.remove(deleteEmp);
        }
    }

    ArrayList<Employee> getTopSalaryStaff(int count) {
        if (count > 0 && count <= Employees.size()) {
            Collections.sort(Employees, Employee::compareTo);
            Collections.reverse(Employees);
            //ArrayList<Employee> EmployeesR = new ArrayList<Employee>();
            //for (int i = 0; i < Employees.size(); i++) {
             //   EmployeesR.add(Employees.get(Employees.size() - 1 - i));
            //}
            ArrayList<Employee> EmployeesMax = new ArrayList<Employee>();
            for (int i = 0; i < count; i++) {
                EmployeesMax.add(Employees.get(i));
            }
            return EmployeesMax;
        } else {
            ArrayList<Employee> EmployeesMax = new ArrayList<Employee>();
            return EmployeesMax;
        }
    }

    ArrayList<Employee> getLowestSalaryStaff(int count) {
        if (count > 0 && count <= Employees.size()) {
            Collections.sort(Employees, Employee::compareTo);
            ArrayList<Employee> EmployeesMin = new ArrayList<Employee>();
            for (int i = 0; i < count; i++) {
                EmployeesMin.add(Employees.get(i));
            }
            return EmployeesMin;
        } else {
            ArrayList<Employee> EmployeesMin = new ArrayList<Employee>();
            return EmployeesMin;
        }
    }

    void payBonuses() {
        getIncome();
        if (profitCompany > 10000000) {

            for (Employee empl : Employees) {
                if (empl.getClass() == TopManager.class) {
                    ((TopManager) empl).monthSalary = (int) (((TopManager) empl).monthSalary * 2.5);
                }
            }
        }
    }
}
