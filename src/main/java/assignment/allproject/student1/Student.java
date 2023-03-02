package assignment.allproject.student1;
import java.util.logging.*;
import java.util.*;
class Student
{
    String name;
    char gradelevel;
    float gpa;
    Scanner sc = new Scanner(System.in);
    Logger log = Logger.getLogger("hi");

    Student(String name,char gradelevel,float gpa) {
          this.name = name;
          this.gradelevel = gradelevel;
          this.gpa = gpa;
    }

    protected void update() {
    	try {
            log.info("You want to Update Your GPA\n1.Yes\n2.No\nEnter 1 or 2: ");
            int x = sc.nextInt();
            if (x == 1) {
                log.info("Enter Updated GPA upto 10: ");
                float updategpa= sc.nextFloat();
                gpa = updategpa;
            }
    	}
    	catch(InputMismatchException e)
    	{
    		log.log(Level.INFO,()->""+e);
    	}
    }

    protected void profile() {
        if (gpa <= 10) {
        	String value = String.valueOf(gpa);
            log.log(Level.INFO,()->""+name+" has a "+value+" GPA");
        } else {
            log.info("Enter valid GPA");
        }
    }
    
}