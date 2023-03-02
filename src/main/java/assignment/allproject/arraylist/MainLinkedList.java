package assignment.allproject.arraylist;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
public class MainLinkedList
{
    protected void linkedList()
    {
    	Scanner sc = new Scanner(System.in);
    	Logger logger = Logger.getLogger("hi");
    	LinkedList object = new LinkedList();
    	int option = 0;
    	try {
    	while(option != 5)
    	{
    		logger.info("Choose Option:\n1.Add\n2.Remove\n3.Search Element\n4.Print Element\n5.exit");
    		option = sc.nextInt();
    		switch(option)
    		{
    			case 1:
    			{
    	    		logger.info("Enter Name:");
    	    		String name = sc.next();
    	    		object.addElement(name);
    				break;
    			}
    			case 2:
    			{
    				logger.info("Enter Name:");
    				String removename = sc.next();
    				object.removeElement(removename);
    				break;
    				
    			}
    			case 3:
    			{
    				logger.info("Enter Name to search::");
    				String searchele = sc.next();
    				object.search(searchele);
    				break;
    			}
    			case 4:
    			{
    				object.print();
    				break;
    			}
    			case 5:
    			{
    				option = 5;
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
