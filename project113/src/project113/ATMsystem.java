package project113;
import java.util.*;
public class ATMsystem {
static Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub

// add ATM obj
ATM atm=new ATM("QuickTeller ATM" , "Located in Riyadh" , "RYD001", 50000);

// Ask the user if they want to log in or sign up
        System.out.println("Welcome to the ATM System!");
        System.out.println("1. Log in");
        System.out.println("2. Sign up");
        System.out.print("Enter your choice: ");
        int choice = in.nextInt();

        switch (choice) {
            case 1:
                System.out.println("You chose to log in.");
                 System.out.println("Enter your customer id");
//search customer and return obj 
// user input pin and validatepin
                break;
            case 2:
                System.out.println("You chose to sign up.");
//add customer obj
do{
            System.out.println("Enter your customer ID (between 10000000 and 99999999)");
            int cID=in.nextInt();
            
            if(cID>=10000000 && cID<=99999999)
            System.out.println("Invalid customer ID, pleas try again");
           }while(cID>=10000000 && cID<=99999999)
           
            System.out.println("Enter your name");
            in.next();
            String name=in.nextLine();
            System.out.println("Enter your date of birth");
            in.next();
            String dob=in.nextLine();
            Customer customer1=new Customer (cID , name , dob);

                break;
            default:
                System.out.println("Invalid choice. Please enter 1 for log in or 2 for sign up.");
        }
	}

}
