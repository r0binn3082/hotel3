public class payment  implements pay {

    private int numberOfNights;
    private int numberOfbreakFast;
    private int numberOflunch;

    public payment(int numberOfNights, int numberOfbreakFast,int numberOflunch ){
        this.numberOfNights = numberOfNights;
        this.numberOfbreakFast = numberOfbreakFast;
        this.numberOflunch = numberOflunch;
    }

    public void setNumberOfNights(int numberOfNights) {
        this.numberOfNights = numberOfNights;
    }
    public void setNumberOfbreakFast(int numberOfbreakFast) {
        this.numberOfbreakFast = numberOfbreakFast;
    }
    public void setNumberOflunch(int numberOflunch) {
        this.numberOflunch = numberOflunch;
    }

    public int getNumberOfNights() {
        return numberOfNights;
    }
    public int getNumberOfbreakFast() {
        return numberOfbreakFast;
    }
    public int getNumberOflunch() {
        return numberOflunch;
    }
    public double getTotalCash() {
        return numberOfNights*perNight + numberOfbreakFast*breakFast + numberOflunch*lunch ;
    }


}