package assignment.allproject.bank1;
import java.util.logging.*;
import java.util.InputMismatchException;
import java.util.Scanner;
public class BankAccount{
	protected BankAccount() {
		
	}
	public static void run()
    	{
		String name = "";
	    long acno = 0;
	    double balance = 0.0;
	    Logger log = Logger.getLogger("hi");
	    Scanner sc = new Scanner(System.in);
        try {
            log.info("Enter Your Name:");
            name = sc.nextLine();
            log.info("Enter Your Account Number:");
            acno = sc.nextLong();
        	}
        	catch(InputMismatchException e)
        	{
        		String str= ""+e;
        		log.info(str);
        	}
        Account obj = new Account(name,acno,balance);
        obj.switchCase();
    }
}
