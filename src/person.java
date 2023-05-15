import java.text.SimpleDateFormat;
import java.util.Date;
public abstract class person {
    protected String name;
    protected String address;
    protected String phoneNumber;
    protected String nationalId;
    protected int age;
    Date birthDate = new Date();
    SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/Y");

    // constructor
    person(){
        name = null;
        address =null;
        phoneNumber =null; 
        age  = 0;
        birthDate =null;
        nationalId = null;
    }
    public person
        (
            String name, 
            String address, 
            String phoneNumber, 
            String nationalId, 
            int age, 
            Date birthDate
            )
        {
            this.name = name;
            this.address = address; 
            this.phoneNumber = phoneNumber;
            this.nationalId = nationalId;
            this.birthDate = birthDate;
        }

    // setters
    public void setAddress(String address) {
        this.address = address;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    //getters
    public String getAddress() {
        return address;
    }
    public int getAge() {
        return age;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public Date getBirthDate() {
        return birthDate;
    }

    @Override
    public String toString() {
        return "name" + name + 
        "address" + address + 
        "phone number" + phoneNumber + 
        "birth date" + dateFormat.format(birthDate)
        ;
    }
}
