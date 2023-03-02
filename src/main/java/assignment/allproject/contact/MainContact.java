package assignment.allproject.contact;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
public class MainContact 
{
	
	protected MainContact() {
		
	}
    public static void run()
    {
	Logger logger = Logger.getLogger("hi");
    	Scanner sc = new Scanner(System.in);
    	LinkedList obj = new LinkedList();
		boolean b = true;
    	try {
    	while(b)
    	{
    		logger.info("Choose Option:\n1.Add\n2.Remove\n3.Search\n4.Print\n5.exit");
    		int op = sc.nextInt();
    		switch(op)
    		{
    			case 1:
    			{
    	    		logger.info("Enter Name:");
    	    		String name = sc.next();
    	    		logger.info("Enter Your Mobile Number:");
    	    		long phone = sc.nextLong();
    	    		logger.info("Enter Email ID:");
    	    		String email = sc.next();
    				obj.addElement(name,phone,email);
    				break;
    			}
    			case 2:
    			{
    				logger.info("Enter Name:");
    				String remname = sc.next();
    				obj.removeElement(remname);
    				break;
    				
    			}
    			case 3:
    			{
    				logger.info("Enter Name to search::");
    				String search = sc.next();
    				obj.search(search);
    				break;
    			}
    			case 4:
    			{
    				obj.print();
    				break;
    			}
    			case 5:
    			{
    				b = false;
    				break;
    			}
    			default:
    			{
    				logger.info("Invalid Option");
    				break;
    			}
    		}
    	}
    	}
    	catch(InputMismatchException e)
		{
			logger.log(Level.INFO,()->""+e);
			sc.nextLine();
		}
    }
}
