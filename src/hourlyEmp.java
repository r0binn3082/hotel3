public class hourlyEmp extends employee {
    private double hours;
    private int perhour =50;

    public void setHours(double hours) {
        this.hours = hours;
    }

    public double getHours() {
        return hours;
    }

    @Override
    public double getSalary() {
        return hours*perhour;
    }
    @Override
    public void setSalary(double salary) {
        System.out.println(" u can't set salary foe this employee, please enter the number of hours");
        setHours(salary);
    }
}
