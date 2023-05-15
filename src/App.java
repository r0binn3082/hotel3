import java.util.*;
import java.text.SimpleDateFormat;
public class App {

    static String name;
    static String address;
    static String phoneNumber; 
    static String nationalId; 
    static int age ;
    static gender gender; 
    static nationalty nat; 
    static Date birthDate = new Date();
    static Date checkInDate = new Date();
    static Date checkOutDate = new Date();
    static int roomNumber;
    public static void main(String[] args) {
        greeting();
        getInfo();


        customer c1 = new customer(
        name, 
        address, 
        phoneNumber,
        nationalId,
        age, 
        gender, 
        nat, 
        birthDate, 
        checkInDate,
        checkOutDate,
        roomNumber
        );

        
    }

    public static void greeting() {

        Scanner keyboard  = new Scanner(System.in);

        System.out.println("welcome to  our hotel ");
        System.out.println("please enter your personal information\nenter yor name");
        name =keyboard.next();

    }

    public static void getInfo() {

        Scanner keyboard  = new Scanner(System.in);

        System.out.println("enter your phone Number ");
        phoneNumber =keyboard.next();
        
        System.out.println("enter your national id");
        nationalId = keyboard.next();
        System.out.println("enter your age");
        age = keyboard.nextInt();
        
    }

    public static void checkOut() {
        
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


}
