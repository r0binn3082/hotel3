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
    switch (z) {
      case 1:
        if (count1st!=(floor1st.length-1)){
          arrl.remove(floor1st[count1st]-101);
          count1st++;
          System.out.println("your reservation has been done.");
        }
        break;
        case 2 :
        System.out.println("your reservation has been canceled");
        break;
      default:
      System.out.println("wrong information");
        break;
    }
    if(z==1){
      if (count1st!=(floor1st.length-1)){
        arrl.remove(floor1st[count1st]-101);
        count1st++;
        System.out.println("your reservation has done sucssfuly.");
      }else if(z==2){
      System.out.println("your reservation has been canceled");
      }else if(z>2){
      System.out.println("");
      }
    }
  }
  
  public void reservation2(){
    System.out.println("confirm your reservation. \n1. yes\n2. no");
    int z= sc.nextInt();
      if(z==1){
        if (count2st!=(floor2st.length-1)){
          arrl.remove(floor2st[count2st]-201);
          count2st++;
          System.out.println("your reservation has done ");
          System.out.println("ypor room number is"+floor2st[count2st]);
      }
    
    }
  }
  
  public void reservation(int x){
    System.out.println("confirm your reservation. \n1. yes\n2. no");
    int z= sc.nextInt();
      if(z==1){
        if (count3st!=(floor3st.length-1)){
        arrl.remove(floor3st[count3st]-301);
        count3st++;
        System.out.println("your reservation has done ");
        System.out.println("ypor room number is"+floor3st[count3st]);
      }
    }
  }
  
  public void checkOut(){
    System.out.println("enter your room number");
    int x=super.sc.nextInt();
    if(x<121&&x>100){
    count1st--;
    arrl.add(x-101, floor1st[x-101]);
    }else if(x<221&&x>200){
    count2st--;
    arrl.add(x-181,floor2st[x-201]);
    }else if(x<321&&x>30){
    count3st--;
    arrl.add(x-261,floor3st[x-301]);
    }else System.out.println("the room number out of bound");
  }
  
  public void empty_rooms(){
    System.out.println(arrl);
  }
}