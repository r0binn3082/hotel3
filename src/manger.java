import java.util.Date;
public class manger extends person implements workers2 {

    Date hiringDate = new Date();
    private postion Mangerpos;
    private double salary;

    public manger(String name , String address, String phoneNumber,String nationalId, int age, gender gender, nationalty nat, Date birthDate){
        super(name, address, phoneNumber,nationalId, age, gender, nat, birthDate);
    }

    @Override
    public void getAllPostion() {
        for(postion pos : postion.values()){
            System.out.println(pos);
        }
    }
    @Override
    public void setHiringDate(Date hiringDate) {
        this.hiringDate = hiringDate;
    }


    @Override
    public void setPostion(postion mangerpos) {
        this.Mangerpos = mangerpos;
    }
    @Override
    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public Date getHiringDate() {
        return hiringDate;
    }
    @Override
    public double getSalary() {
        return salary;
    }
    @Override
    public postion getPostion() {
        return Mangerpos;
    }

    @Override
    public String toString() {
        
        return 
        super.toString()+
        "postion" + Mangerpos +
        "salary" + salary + 
        "hiring date" + hiringDate
        ;
    }
    public postion getMangerpos() {
        return Mangerpos;
    }
    public void setMangerpos(postion mangerpos) {
        Mangerpos = mangerpos;
    }
}
