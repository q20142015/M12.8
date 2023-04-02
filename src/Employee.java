public interface Employee {
    int  getMonthSalary();
   public default int compareTo(Employee o) {
        int result = this.getMonthSalary()>o.getMonthSalary() ? 1 : 0;
        return result;
    }
}
