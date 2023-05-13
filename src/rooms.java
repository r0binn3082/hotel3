import java.util.*;
public class rooms extends Hotel {

  public rooms(){
    for(int i = 0 ; i < floor1st.length ; i++){
      arrl.add(floor1st[i]);
    }
    for(int i=0;i<floor2st.length;i++){
      arrl.add(floor2st[i]);
    }
    for(int i=0;i<floor3st.length;i++){
      arrl.add(floor3st[i]);
    }
  }

  public void reservation(){
    System.out.println("confirm your reservation. \n1. yes\n2. no");
    int z= sc.nextInt();
    if(z==1){
      if (count1st!=(floor1st.length-1)){
        arrl.remove(floor1st[count1st]-101);
        count1st++;
        System.out.println("your reservation has been done.");
      }
    }
  }

  public void reservation2(){
    if (count2st!=(floor2st.length-1)){
      arrl.remove(floor2st[count2st]-201);
      count2st++;
      System.out.println("your reservation has done 2");
    }
  }

  public void reservation(int x){
    if (count3st!=(floor3st.length-1)){
      arrl.remove(floor3st[count3st]-301);
      count3st++;
    }
  }


  public void check_out(){
    System.out.println("enter your room number");
    int x=super.sc.nextInt();
    if(x<150){
      count1st--;
      arrl.remove(floor1st[x-101]);
    }else if(x<250){
      count2st--;
      arrl.remove(floor2st[x-201]);
    }else if(x<321){
      count3st--;
      arrl.remove(floor3st[x-301]);
    }
    else System.out.println("the room number out of bound"); 
  }

  public void empty_rooms(){
    System.out.println(arrl);
  }
}