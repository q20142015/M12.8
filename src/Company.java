import java.util.ArrayList;

public class Company {

    ArrayList< Employee > Employees = new ArrayList< Employee >();
    int profitCompany=0;

   int getIncome()
    {
        for(Employee empl : Employees)
        {
         if(empl.getClass()==Manager.class)
         {
             profitCompany+=((Manager) empl).profitForCompany;
         }
        }
        return profitCompany;
    }

   void hire(Employee employee){
       Employees.add(employee);
   }
   void hireAll(ArrayList<Employee> employees){
        for(Employee empl : employees) {
            Employees.add(empl);
        }
   }
   void fire() {
       int eL=Employees.size();
       if (eL>0) {
           int deleteEmp = (int) (Math.random() * (eL-1));
           Employees.remove(deleteEmp);
       }
   }
    ArrayList<Employee> getTopSalaryStaff(int count){

       return null;

    }
    ArrayList<Employee> getLowestSalaryStaff(int count){
        return null;

    }
    void  payBonuses()
    {
        getIncome();
        if(profitCompany>10000000){

            for(Employee empl : Employees)
            {
                if(empl.getClass()==Manager.class)
                {
                   ((TopManager) empl).monthSalary=(int)(((TopManager) empl).monthSalary*2.5);
                }
            }
        }
    }
}
