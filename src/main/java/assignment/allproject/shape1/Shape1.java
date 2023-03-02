package assignment.allproject.shape1;
import java.util.logging.*;
import java.util.*;
public class Shape1{
	
	protected Shape1() {
		
	}
    public static void run()
    {
        int x;
        boolean b = true;
	Logger logger = Logger.getLogger("hi");
        Scanner sc = new Scanner(System.in);
    	while (b) {
    		try {
    		Shape sp;
            logger.info("1.Circle\n2.Rectangle\n3.Triangle\n4.Exit\nEnter your option 1 or 2 or 3 or 4: ");
            x = sc.nextInt();
                if (x == 1) {
                    logger.info("Enter Circle Radius:");
                    float radius = sc.nextFloat();
                    sp = new Shape(x,radius);
                    sp.perimeter();
                    sp.area();
                } else if (x == 2) {
                    logger.info("Enter Rectangle Height:");
                    float height = sc.nextFloat();
                    logger.info("Enter Rectangle Width:");
                    float width = sc.nextFloat();
                    sp = new Shape(x,height,width);
                    sp.perimeter();
                    sp.area();
                } else if (x == 3) {
                    logger.info("Enter Triangle base: ");
                    float base = sc.nextFloat();
                    logger.info("Enter Triangle side1: ");
                    float side1 = sc.nextFloat();
                    logger.info("Enter Triangle Side2: ");
                    float side2 = sc.nextFloat();
                    sp = new Shape(x,base,side1,side2);
                    sp.perimeter();
                    sp.area();
                }else {
                    b = false;
                }
            }
    		catch(InputMismatchException e)
    		{
    			logger.log(Level.INFO,()->""+e);
    		}
    	}
    }
}
