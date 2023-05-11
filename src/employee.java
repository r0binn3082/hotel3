import java.util.Date;
public class employee extends person implements  workers2 {
    protected postion postion;
    protected double salary;
    Date hiringDate = new Date();

    @Override
    public void setPostion(postion postion) {
        this.postion = postion;
    }
    @Override
    public void setSalary(double salary) {
        this.salary = salary;
    }
    @Override
    public void setHiringDate(Date hiringDate) {
        this.hiringDate = hiringDate;
    }

    @Override
    public postion getPostion() {
        return postion;
    }
    @Override
    public double getSalary() {
        return salary;
    }
    @Override
    public Date getHiringDate() {
        return hiringDate;
    }
    @Override
    public void getAllPostion() {
        for(postion pos : postion.values()){
            System.out.println(pos);
        }
    }

    @Override
    public String toString() {
        return super.toString() +
        "postion" + postion +
        "salary" + salary + 
        "hiring date" + hiringDate
        ;
    }
}
