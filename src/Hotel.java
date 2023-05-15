import java.util.*;
public abstract class Hotel{


  protected int count1st =0;
  protected int[] floor1st= new int[20];
  protected int[] floor2st= new int[20];
  protected int count2st=0;
  protected int[] floor3st= new int[20];
  protected int count3st=0;
  protected String n;
  protected String id;

  Scanner sc = new Scanner(System.in);
  ArrayList<Integer> arrl=new ArrayList<Integer>();

  public Hotel(){
    for(int i=0;i<floor1st.length;i++){
      floor1st[i]=i+101;
    }
    for(int i=0;i<floor2st.length;i++){
      floor2st[i]=i+201;
    } 
    for(int i=0;i<floor3st.length;i++){
      floor3st[i]=i+301;  
    }
  }
}