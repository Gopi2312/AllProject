package assignment.allproject.hashmap;

import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.*;
public class MainHash {
	
	protected MainHash() {
		
	}
	public static void run()
	{
		Logger logger = Logger.getLogger("hi");
		Scanner sc = new Scanner(System.in);
		boolean b = true;
		while(b)
		{
			try {
				logger.info("Choose Option:\n1.Hashmap\n2.Hashset\n3.Treeset\n4.Exit");
				int choice = sc.nextInt();
				if(choice == 1)
				{
					Hashmap map = new Hashmap();
					map.hashmap();
				}
				else if(choice == 2)
				{
					Hashset hset = new Hashset();
					hset.hashset();
				}
				else if(choice == 3)
				{
					Treeset tset = new Treeset();
					tset.treeset();
				}
				else if(choice == 4)
				{
					b = false;
				}
				else
				{
					logger.info("Invalid Option");
				}
			}catch(Exception e) {
				logger.log(Level.INFO,()->""+e);
				sc.nextLine();
			}
		}
	}
}
