import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Company gazprom=new Company();
        for (int i=0;i<180;i++){
            Operator operator=new Operator();
            gazprom.hire(operator);
        }
        for (int i=0;i<100;i++){
            Manager manager=new Manager();
            gazprom.hire(manager);
        }
        for (int i=0;i<10;i++){
            TopManager topmanager=new TopManager();
            gazprom.hire(topmanager);
        }
        gazprom.payBonuses();

        ArrayList< Employee > emin = new ArrayList< Employee >();
        ArrayList< Employee > emax = new ArrayList< Employee >();
        emin=gazprom.getLowestSalaryStaff(5);
        emax=gazprom.getTopSalaryStaff(5);


        int pause=0;
    }
}
