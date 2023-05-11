import java.util.Date;

public interface workers2 {

    void setPostion(postion postion);

    void setSalary(double salary);

    void setHiringDate(Date hiringDate);

    postion getPostion();

    double getSalary();

    Date getHiringDate();

    void getAllPostion();

    String toString();

}