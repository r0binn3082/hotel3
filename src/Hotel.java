import java.math.BigInteger;
import java.util.*;
public class Hotel {

  protected int x;
  protected int y;
  protected int count1st =0;
  protected int[] floor1st= new int[20];
  protected int[] floor2st= new int[20];
  protected int count2st=0;
  protected int[] floor3st= new int[20];
  protected int count3st=0;

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


  System.out.println("                    welcome to  our hotel ");
  System.out.println("please enter your personal information\nenter yor name");
  String n=sc.next();

  System.out.println("enter your national id");
  String id=sc.next();

  System.out.println("1. for resevation press \n2. for check out\n3. see empty rooms");
  x=sc.nextInt();
  if(x==1){
    System.out.println("what kind of room do you want to reserve\n1. single room\n2. double room\n3. full sweet");
    y=sc.nextInt();
  }
  }
}