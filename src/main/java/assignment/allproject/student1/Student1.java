package assignment.allproject.student1;
import java.util.logging.*;
import java.util.*;
public class Student1{
	
	protected Student1() {
		
	}
	public static void run()
        {
	    String name;
	    char gradelevel;
	    float gpa;
	    Logger log = Logger.getLogger("hi");
	    Scanner sc = new Scanner(System.in);
	    try {
		    log.info("Enter Name: ");
	        name = sc.nextLine();
	        log.info("Enter Grade_Level:");
	        gradelevel = sc.next().charAt(0);
	        log.info("Enter GPA upto 10:");
	        gpa = sc.nextFloat();
	    	Student std = new Student(name,gradelevel,gpa);
	        std.update();
	        std.profile();
	    }
	    catch(InputMismatchException e) {
	    	log.log(Level.INFO,()->""+e);
	    }
    }
}
