package assignment.allproject.card;
import java.util.*;
import java.util.logging.*;
public class MainCard
{
	final static Logger log = Logger.getLogger("hi");
	protected MainCard() {
		log.info("Welcmo to MainCard");
	}
    public static void run()
    {
        Scanner sc = new Scanner(System.in);
        try {
	        log.info("Enter Card Holder Name:");
	        String cardname = sc.nextLine();
	        log.info("Enter Card Number:");
	        Long cardnum = sc.nextLong();
	        log.info("Enter Expire Date:");
	        String exdate = sc.next();
	        TestCard tc = new TestCard(cardname,cardnum,exdate);
	        TestCard tc1 = tc.clo();
	        Long valnum = 97889122l;
	        boolean x = tc1.test(valnum);
	        log.log(Level.INFO,() -> "" +x);
	        if(x)
	        {
	        	log.log(Level.INFO,() ->"Card Name:" +cardname);
	        	log.log(Level.INFO,() ->"Card number:" +cardnum);
	        	log.log(Level.INFO,() ->"Expiry Date:" +exdate);
	        }
	        else
	        {
	            log.info("invalid");
	        }
        }
        catch(Exception e)
        {
        	log.log(Level.INFO,()->""+e);
        }
    }
}