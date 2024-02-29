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


//error customer1 can't resolve?
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
        System.out.println("Enter your overdraft limit: ");
        double limit=in.nextDouble();
        // current object added:
        Account acc1= new CurrentAccount(acc1Num ,'c',PIN,transNum,limit);

        break;

        case 2:
        // saving account case
        System.out.println("Enter your Account number and PIN: ");
        int acc2Num =in.nextInt();
        int PIN2 = in.nextInt();
        System.out.println("Enter the number of transaction your willing to make. ");
        int transNum2=in.nextInt();
        System.out.println("Enter your interset rate: ");
        double inteRate=in.nextDouble();
        // saving object added:
        Account acc2= new SavingAccount(acc2Num ,'s',PIN2,transNum2,inteRate); //accType may delete
        break ;

        case3:
        System.out.println("Thank you for using this ATM.");
        System.exit(0);
        break;

        default:
        System.out.println("Invalid choice. ");
       }//option switch end

       System.out.println("Select the account you want to access: ");
       System.out.println("1- Checking current account.\n2- Saving account.\n3-Exit.");
       option = in.nextInt(); //keep showing menu until customer exit
        } while (option >=1 && option <=3);

    }//main ends
//Method for showing menu of the selected account since each one have different menu.. 
    /*public int TransactionsMenu(Account acc){
        int opt=0;
        if ( acc instanceof CurrentAccount)
          {  //Curren menu
        System.out.println("-----Checking Current Account-----");
        System.out.println("1) view Balance.\n2) withdraw cash.\n3) deposit cash.\n4) view last transaction.\n5) exit");
         opt =in.nextInt();
        }
        else if (acc instanceof SavingAccount)
          {  //Saving menu
             System.out.println("-----Checking Current Account-----");
             System.out.println("1) view Balance.\n2) withdraw cash.\n3) deposit cash.\n4) view last transaction.\n5) calculate interset rate. ");
         opt=in.nextInt();   
        }
        return opt;

    } method end here*/

}
