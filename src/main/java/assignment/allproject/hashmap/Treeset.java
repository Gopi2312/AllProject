package assignment.allproject.hashmap;
import java.util.Set;
import java.util.TreeSet;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Treeset {

	protected void treeset(){
		Logger logger = Logger.getLogger("hi");
		Set<String> set = new TreeSet<>();
		set.add("chennai");
		set.add("madurai");
		set.add("theni");
		set.add("ramnad");
		set.add("paramakudi");
		logger.log(Level.INFO,()->""+set);
		int n = set.size();
		logger.log(Level.INFO,()->"Size of a set"+n);
		logger.log(Level.INFO,()->"Is theni in the Treeset: "+set.contains("theni"));
		set.remove("theni");
		logger.log(Level.INFO,()->""+set);	
	}

}
