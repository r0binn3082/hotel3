import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
public class rooms extends Hotel {
  
  Date checkInDate = new Date();
  

  public rooms(){
    super();
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

  public void kindOfResrvation() {
    Scanner key  = new Scanner(System.in);
    
    System.out.println("enter which room you want to reserve\n1. single room\n2. double room\n3. full sweet");
    int w=key.nextInt();

    switch (w) {
      case 1:
        reservation();
        break;
      case 2:
      reservation2();
      break;
      case 3 :
      reservation(3);
      default:
      System.out.println("wrong input \n try again");
      kindOfResrvation();
        break;
    }
  }

  public void  reservation(){ 
    System.out.println("confirm your reservation. \n1. yes\n2. no");
    int z= sc.nextInt();
    if (count1st!=(floor1st.length-1)){
      arrl.remove(floor1st[count1st]-101);
      count1st++;
      System.out.println("your reservation has been done.");
      System.out.println("your room number is "+ floor1st[count1st-1]);
    }else{System.out.println("there is no empty rooms");}
    }
  
  public int get_roomnumber(){
    return floor1st[count1st-1] ;
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
      }else {System.out.println("there is no empty rooms");} 
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
      }else {System.out.println("there is no empty rooms");}
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

  public void room_booking() throws ParseException{

    SimpleDateFormat df = new SimpleDateFormat("mm/dd/yyyy");
    
    System.out.println("what kind of room do you want to reserve\n1. single room\n2. double room\n3. full sweet");
    int s=sc.nextInt();
        System.out.println("enter your check in date mm/dd/yy ");
        String d = sc.next();
        if(!d.isEmpty() ){
          checkInDate= df.parse(d);
      }
        switch(s){
        case 1:
            reservation();
            break;
        case 2:
            reservation2();
            break;
        case 3:
            reservation(3);
            break;
        default:
            System.out.println("wrong input");
            break;
    }
  }
  
  public void cancel_booking(){
    System.out.println("enter your room number");
    int x=super.sc.nextInt();
    if(x<121&&x>100){
      count1st--;
      arrl.add(x-101, floor1st[x-101]);
      System.out.println("your booking has been canceled ");
    }else if(x<221&&x>200){
    count2st--;
    arrl.add(x-181,floor2st[x-201]);
    System.out.println("your booking has been canceled ");
    }else if(x<321&&x>30){
    count3st--;
    arrl.add(x-261,floor3st[x-301]);
    System.out.println("your booking has been canceled ");
    }else{System.out.println("the room number out of bound");
    }
  }
}