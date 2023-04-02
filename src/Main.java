import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Company Gazprom=new Company();
        for (int i=0;i<180;i++){
            Operator operator=new Operator();
            Gazprom.hire(operator);
        }
        for (int i=0;i<100;i++){
            Manager manager=new Manager();
            Gazprom.hire(manager);
        }
        for (int i=0;i<10;i++){
            TopManager topmanager=new TopManager();
            Gazprom.hire(topmanager);
        }
        Gazprom.payBonuses();

        ArrayList< Employee > Emin = new ArrayList< Employee >();
        ArrayList< Employee > Emax = new ArrayList< Employee >();
        Emin=Gazprom.getLowestSalaryStaff(5);
        Emax=Gazprom.getTopSalaryStaff(5);


        int pause=0;
    }
}
