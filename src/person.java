import java.text.SimpleDateFormat;
import java.util.Date;
public abstract class person {
    protected String name;
    protected String address;
    protected String phoneNumber;
    protected String nationalId;
    protected int age;
    protected gender gender;
    protected nationalty nat;
    Date birthDate = new Date();
    SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/Y");

    person(){
        name = null;
        address =null;
        phoneNumber =null; 
        age  = 0;
        gender  =null;
        nat =null;
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
            gender gender, 
            nationalty nat, 
            Date birthDate
            )
        {
            this.name = name;
            this.address = address; 
            this.phoneNumber = phoneNumber;
            this.nationalId = nationalId;
            this.gender = gender; 
            this.nat = nat;
            this.birthDate = birthDate;
        }

    public void setAddress(String address) {
        this.address = address;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setGender(gender gender) {
        this.gender = gender;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setNat(nationalty nat) {
        this.nat = nat;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getAddress() {
        return address;
    }
    public int getAge() {
        return age;
    }
    public gender getGender() {
        return gender;
    }
    public String getName() {
        return name;
    }
    public nationalty getNat() {
        return nat;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public Date getBirthDate() {
        return birthDate;
    }

    public void getnationalties() {
        for ( nationalty MYnat : nationalty.values()){
            System.out.println(MYnat);
        }
    }

    @Override
    public String toString() {
        return "name" + name + 
        "address" + address + 
        "phone number" + phoneNumber + 
        "nationalty" + nat +
        "gender" + gender +
        "birth date" + dateFormat.format(birthDate)
        ;
    }
}
