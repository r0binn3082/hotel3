import java.util.*;
public abstract class Hotel{

    protected int count1st ;
    protected int[] floor1st= new int[20];
    protected int[] floor2st= new int[20];
    protected int count2st;
    protected int[] floor3st= new int[20];
    protected int count3st;
    protected String n;
    protected String id;
    Scanner sc = new Scanner(System.in);
    ArrayList<Integer> arrl=new ArrayList<Integer>();

    
    public Hotel(){
        for(int i=0;i<floor1st.length;i++){
    floor1st[i]=i+101;
    floor2st[i]=i+201;
    floor3st[i]=i+301;
    }

    }
    public void setArrl(ArrayList<Integer> arrl) {
        this.arrl = arrl;
    }
    public void setCount1st(int count1st) {
        this.count1st = count1st;
    }
    public void setCount2st(int count2st) {
        this.count2st = count2st;
    }
    public void setCount3st(int count3st) {
        this.count3st = count3st;
    }
    public void setFloor1st(int[] floor1st) {
        this.floor1st = floor1st;
    }
    public void setFloor2st(int[] floor2st) {
        this.floor2st = floor2st;
    }
    public void setFloor3st(int[] floor3st) {
        this.floor3st = floor3st;
    }
    public void setId(String id) {
        this.id = id;
    }
    public void setN(String n) {
        this.n = n;
    }
    public void setSc(Scanner sc) {
        this.sc = sc;
    }

    public ArrayList<Integer> getArrl() {
        return arrl;
    }
    public int getCount1st() {
        return count1st;
    }
    public int getCount2st() {
        return count2st;
    }
    public int getCount3st() {
        return count3st;
    } 
    public int[] getFloor1st() {
        return floor1st;
    }
    public int[] getFloor2st() {
        return floor2st;
    }
    public int[] getFloor3st() {
        return floor3st;
    }
    public String getId() {
        return id;
    }
    public String getN() {
        return n;
    }
    public Scanner getSc() {
        return sc;
    }

}