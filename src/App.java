import java.util.*;
import java.text.*;

public class App {

    static String name;
    static String address;
    static String phoneNumber; 
    static String nationalId; 
    static int age ; 
    static Date birthDate = new Date();
    static Date checkInDate = new Date();
    static Date checkOutDate = new Date();
    static int roomNumber;
    public static void main(String[] args) throws ParseException {
        rooms r1 = new rooms();
        
        int x = greeting();
        select(x, r1);

        
        
        customer c1 = new customer(
            name, 
            address, 
            phoneNumber,
            nationalId,
            age, 
            birthDate, 
            checkInDate,
            checkOutDate,
            roomNumber
            );
    }
    
    
    public static int greeting() {

        Scanner keyboard  = new Scanner(System.in);

        System.out.println("welcome to  our hotel ");
        System.out.println("how can i help u?");
        System.out.println("1.log in");
        System.out.println("2.get an avalibale room");
        System.out.println("3.for reservation");
        System.out.println("4.book a room");
        System.out.println("5.cancel booking");
        System.out.println("6.checking out");
        System.out.println("7.get fee");
        System.out.println("8.for room service");

        int x = keyboard.nextInt();
        return x;

    }

    public static void getInfo() throws ParseException {
        
        Scanner keyboard  = new Scanner(System.in);
        SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");

        System.out.println("please enter your personal information\nenter yor name");
        name =keyboard.nextLine();
        
        System.out.println("enter your phone Number ");
        phoneNumber =keyboard.nextLine();
        
        System.out.println("enter your national id");
        nationalId = keyboard.nextLine();

        System.out.println("enter your age");
        age = keyboard.nextInt();
        
        System.out.println("enter ur birthday mm/dd/yy ");
        String d = keyboard.nextLine();
        
        if(!d.isEmpty() ){
            birthDate = dateFormat.parse(d);
            System.out.println(birthDate);
        }
        
        System.out.println("enter ur check out date mm/dd/yy ");
        String s = keyboard.nextLine();
        if(!s.isEmpty()){
            checkInDate = dateFormat.parse(s);
        }
        System.out.println("enter ur check in date mm/dd/yy ");
        String t = keyboard.nextLine();

        if(!t.isEmpty()){
            checkOutDate = dateFormat.parse(t);
        }

    }

    public static void gettingFee() {
        
        Scanner keyboard = new Scanner(System.in);

        System.out.println("how many days u had breakfast?");
        int breakFast = keyboard.nextInt();

        System.out.println("how many days u had lunc?");
        int lunch = keyboard.nextInt();


        System.out.println("how many days u being with us?");
        int nights = keyboard.nextInt();

        payment p1 = new payment(nights, breakFast, lunch);

        System.out.println("the total cost is" + p1.getTotalCash());
    }
    
    public static void select(int x, rooms r1) throws ParseException {
        switch (x) {
            case 1:
                getInfo();
                break;
            case 2:
                r1.empty_rooms();
            break;
            case 3:
            r1.kindOfResrvation();
            break;
            case 4:
                r1.room_booking();
            break;
            case 5:
                r1.cancel_booking();
            break;
            case 6:
                r1.checkOut();
            break;
            case 7:
                gettingFee();
            break;
            case 8:
            roomService rs= new roomService();    
            rs.get_service();
            break;
            default:
                System.out.println("wong information");
                System.out.println("try again");
                x = greeting();
                select(x, r1);
            break;
        }
    }

}