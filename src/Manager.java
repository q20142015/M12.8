public class Manager
implements Employee{
    int  profitForCompany=(int)(Math.random()*25000)+100000;

    @Override
    public int getMonthSalary() {
        int monthSalary=20000+(int)(profitForCompany*0.05);
        return monthSalary;
    }
}
