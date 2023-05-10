import java.util.Date;

public class customer extends person {

    protected long serialNumber;
    Date checkInDate = new Date();
    Date checkOutDate = new Date();
    private int roomNumber;

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
        return checkInDate;
    }
    public Date getCheckOutDate() {
        return checkOutDate;
    }

    @Override
    public String toString() {
        return super.toString() + 
        "serialNumber" + serialNumber +
        "room number" + roomNumber +
        "check in date " + checkInDate +
        "check out date " + checkOutDate;
    }
}
