package assignment.allproject.coordinates;
import java.util.*;
import java.util.logging.*;
public class MainCoordinate
{
	final static Logger log = Logger.getLogger("hi");
	protected MainCoordinate() {
		log.info("Welcmo to MainCoordinate");
	}
    public static void run()
    {
        Scanner sc = new Scanner(System.in);
        try {
        log.info("Enter Coordinate x: ");
        Float x=sc.nextFloat();
        log.info("Enter Coordinate y: ");
        Float y=sc.nextFloat();
        
        Coordinate1 co = new Coordinate1(x,y);
        Coordinate1 co1 = co.clo();
        if(co1.equals())
        {
           log.info("Both are same");
        }
        else
        {
            log.info("Not Same");
        }
        }
        catch(InputMismatchException e)
        {
        	log.log(Level.INFO,()->""+e);
        }
    }
}