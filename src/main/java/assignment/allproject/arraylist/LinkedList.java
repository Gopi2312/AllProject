package assignment.allproject.arraylist;

import java.util.logging.Logger;
class LinkedList{
	Logger logger = Logger.getLogger("hio");
    Node rootnode;
    int count = 0;
    LinkedList()
    {
    	rootnode = null;
    }
    
    void addElement(String name)
    {
    	
            if(rootnode == null)
            {
                rootnode= new  Node(name);
                count++;
            }
            else
            {
                Node temp = rootnode;
                while(temp.nextnode != null)
                {
                    temp = temp.nextnode;
                }
                temp.nextnode = new Node(name);
                count++;
            }
    }
    
    void removeElement(String remname){
    	Node temp = rootnode;
		Node prev=rootnode;
		String str = "Deleted Contact Sucessfully";
		int mark=0;
		while(temp!=null)
		{
			if(remname.equals(rootnode.name))
			{
				mark=1;
				rootnode=temp.nextnode;
				logger.info(str);
				temp = null;
			}
			else if(remname.equals(temp.name))
			{
					mark=1;
					logger.info(str);
					prev.nextnode=prev.nextnode.nextnode;
					rootnode = prev;
					break;
				
			}
			else
			{
				prev = temp;
				temp=temp.nextnode;	
			}
			
		}
		if(mark == 0)
		{
			logger.info("No Contact found ");
		}
		
	}
    
   void search(String search)
    {
    	int flag = 0;
    	Node searchnode = rootnode;
    	while(searchnode != null)
    	{
    		if(search.equals(searchnode.name))
    		{
    			flag = 1;
        		String a ="Name:"+searchnode.name;
    			logger.info(a);
    		}
    		searchnode = searchnode.nextnode;
    	}
    	if(flag == 0)
    	{
    		logger.info("No Contact on the List");
    	}
    }
 
    void print()
    {
    	Node temp1 = rootnode;
    	if(temp1 == null)
    	{
    		logger.info("Empty List");
    	}
    	else
    	{
    		while(temp1 != null)
    		{
        		String a ="Name:"+temp1.name;
    			logger.info(a);
    			temp1 = temp1.nextnode;
    		}
    		
    	}
    }
}

