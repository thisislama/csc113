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
           } while(cID>=10000000 && cID<=99999999);
           
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
        }//switch choice end

        System.out.println("Welcome "+customer1.getName()+"\nYour ID: "+customer1.getCustomerID());
        System.out.println("Select the account you want to access: ");
        System.out.println("1- Checking current account.\n2- Saving account.\n3-Exit.");

int option = in.nextInt();
        do{
       switch (option){

        case 1:
        //curent account case
        System.out.println("Enter your Account number and PIN: ");
        int acc1Num =in.nextInt();
        int PIN = in.nextInt();
        System.out.println("Enter the number of transaction your willing to make. ");
        int transNum=in.nextInt();
        // current object added:
        Account acc1= new CurrentAccount(acc1Num ,'c',PIN,transNum);

        break;

        case 2:
        break;

        case3:
        System.out.println("Thank you for using this ATM.");
        System.exit(0);
        break;

        default:
        System.out.println("Invalid choice. Please renter your option.");
       }//option switch end

       System.out.println("Select the account you want to access: ");
       System.out.println("1- Checking current account.\n2- Saving account.\n3-Exit.");
       opt = in.nextInt(); //keep showing menu until customer exit
        } while (option >=1 && option <=3);

	}//main ends

}
