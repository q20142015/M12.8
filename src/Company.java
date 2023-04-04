import java.util.ArrayList;
import java.util.Collections;

public class Company {

    ArrayList<Employee> employees = new ArrayList<Employee>();
    int profitCompany = 0;

    int getIncome() {
        for (Employee empl : employees) {
            if (empl.getClass() == Manager.class) {
                profitCompany += ((Manager) empl).profitForCompany;
            }
        }
        return profitCompany;
    }

    void hire(Employee employee) {
        employees.add(employee);
    }

    void hireAll(ArrayList<Employee> employees) {
        for (Employee empl : employees) {
            this.employees.add(empl);
        }
    }

    void fire() {
        int eL = employees.size();
        if (eL > 0) {
            int deleteEmp = (int) (Math.random() * (eL - 1));
            employees.remove(deleteEmp);
        }
    }

    ArrayList<Employee> getTopSalaryStaff(int count) {
        if (count > 0 && count <= employees.size()) {
            Collections.sort(employees, Employee::compareTo);
            Collections.reverse(employees);
            //ArrayList<Employee> EmployeesR = new ArrayList<Employee>();
            //for (int i = 0; i < Employees.size(); i++) {
             //   EmployeesR.add(Employees.get(Employees.size() - 1 - i));
            //}
            ArrayList<Employee> employeesMax = new ArrayList<Employee>();
            for (int i = 0; i < count; i++) {
                employeesMax.add(employees.get(i));
            }
            return employeesMax;
        } else {
            ArrayList<Employee> employeesMax = new ArrayList<Employee>();
            return employeesMax;
        }
    }

    ArrayList<Employee> getLowestSalaryStaff(int count) {
        if (count > 0 && count <= employees.size()) {
            Collections.sort(employees, Employee::compareTo);
            ArrayList<Employee> employeesMin = new ArrayList<Employee>();
            for (int i = 0; i < count; i++) {
                employeesMin.add(employees.get(i));
            }
            return employeesMin;
        } else {
            ArrayList<Employee> employeesMin = new ArrayList<Employee>();
            return employeesMin;
        }
    }

    void payBonuses() {
        getIncome();
        if (profitCompany > 10000000) {

            for (Employee empl : employees) {
                if (empl.getClass() == TopManager.class) {
                    ((TopManager) empl).monthSalary = (int) (((TopManager) empl).monthSalary * 2.5);
                }
            }
        }
    }
}
