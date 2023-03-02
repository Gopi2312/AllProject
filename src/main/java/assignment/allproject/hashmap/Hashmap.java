package assignment.allproject.hashmap;
import java.util.*;
import java.util.Map.Entry;
import java.util.logging.*;
public class Hashmap 
{
    protected void hashmap()
    {
    	Logger logger = Logger.getLogger("com.api.jar");
        Map <String,Integer> map = new HashMap<>();
        map.put("gopi", 21);
        map.put("kl", 20);
        map.put("mohan", 23);
        map.put("saran", 19);
        map.put("hari", 19);
        logger.log(Level.INFO,()->"Map"+map);
        Set<Entry<String, Integer>> set = map.entrySet();
        Iterator<Entry<String, Integer>> ite = set.iterator();
        while(ite.hasNext())
        {
        	Entry<String, Integer> obj = ite.next();
        	Object x = obj.getValue();
        	if(x.equals(19))
        	{
        		logger.log(Level.INFO,()-> "Key for Value 19 :"+obj.getKey());
        	}
        	
        }
        logger.log(Level.INFO,()-> "Size of Map: "+map.size());
        map.clear();
        logger.log(Level.INFO,()-> "Size of Map: "+map.size());
        
    }
}
