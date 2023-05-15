import java.util.Date;
import java.text.SimpleDateFormat;

public class customer extends person {

    protected long serialNumber;
    Date checkInDate = new Date();
    Date checkOutDate = new Date();
    private int roomNumber;
    SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/Y");

    public customer(){
        super();
        checkInDate =null;
        checkOutDate =null;
        roomNumber =0;
    }
    public customer(

        String name,
        String address,
        String phoneNumber,
        String nationalId,
        int age, 
        Date birthDate,
        Date checkInDate,
        Date checkOutDate,
        int roomNumber
        )
    {
        super(name, address, phoneNumber, nationalId, age, birthDate);
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
        this.roomNumber = roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }
    public void setSerialNumber(long serialNumber) {
        this.serialNumber = serialNumber;
    }
    public void setCheckInDate(Date checkInDate) {
        this.checkInDate = checkInDate;
    }
    public void setCheckOutDate(Date checkOutDate) {
        this.checkOutDate = checkOutDate;
    }

    public long getSerialNumber() {
        return serialNumber;
    }
    public int getRoomNumber() {
        return roomNumber;
    }
    public Date getCheckInDate() {
        return checkInDate ;
    }
    public Date getCheckOutDate() {
        return checkOutDate ;
    }

    @Override
    public String toString() {
        return super.toString() + 
        "serialNumber" + serialNumber +
        "room number" + roomNumber +
        "check in date " + dateFormat.format(checkInDate)  +
        "check out date " + dateFormat.format(checkOutDate) ;
    }
}
