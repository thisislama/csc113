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
                
//search customer and return obj 
// user input pin and validatepin
                break;
            case 2:
                System.out.println("You chose to sign up.");
//add customer obj
                break;
            default:
                System.out.println("Invalid choice. Please enter 1 for log in or 2 for sign up.");
        }
	}

}
