package assignment.allproject.bank1;
import java.util.logging.*;
import java.util.InputMismatchException;
import java.util.Scanner;
public class BankAccount{
	final static Logger log = Logger.getLogger("hi");
	protected BankAccount() {
		log.info("Welcmo to BankAccount");
	}
	public static void run()
    {
		String name = "";
	    long acno = 0;
	    double balance = 0.0;
	    
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