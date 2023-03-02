package assignment.allproject.coordinates;
import java.util.logging.*;
public class Coordinate1 implements cloneable{
	Logger log = Logger.getLogger("hi");
	Float x;
	Float y;
	Coordinate1(Float x,Float y)
	{
		this.x = x;
		this.y = y;
	}
	protected boolean equals() 
	{
        	return x.equals(y);
    }
	protected Coordinate1 clo() 
	{
    	try{
    		return (Coordinate1)super.clone();
    		
    	}
    	catch(CloneNotSupportedException e)
    	{
    		log.info("Clowning error");
    		return this;
    	}
	}
}

