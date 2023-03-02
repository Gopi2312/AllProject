package assignment.allproject.dbconnection;
import java.util.*;
import java.util.logging.*;
public class MainDB
{
    public static void run()
    {
        Scanner sc = new Scanner(System.in);
        Logger log = Logger.getLogger("hi");
        log.info("Enter DataBase URL: ");
        String database = sc.nextLine();
        log.info("Enter UserName: ");
        String username = sc.nextLine();
        log.info("Enter Password: ");
        String password = sc.nextLine();
        DBConnection db = DBConnection.getInstance(database,username,password);
        boolean b = true;
        while(b)
        {
        	try {
	        	log.info("1.connection 2.close 3.exit");
	            log.info("Enter Choice");
	            int n = sc.nextInt();
	        	switch(n)
	        	{
	        		case 1:
	        		{
	        			db.connection();
	        			break;
	        		}
	        		case 2:
	        		{
	        			db.close();
	        			break;
	        		}
	        		case 3:
	        		{
	        			b=false;
	        			break;
	        		}
	        		default:
	        		{
	        			log.info("Invalid");
	        			break;
	        		}
	        		
	        	}
        	}catch(Exception e)
        	{
        		e.printStackTrace();
        		sc.nextLine();
        	}
        }
        
    }
}
//jdbc:mysql://localhost/gopi