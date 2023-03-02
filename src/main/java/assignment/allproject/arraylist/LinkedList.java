package assignment.allproject.arraylist;

import java.util.logging.Logger;
class LinkedList{
	Logger logger = Logger.getLogger("hio");
    Node root;
    int count = 0;
    LinkedList()
    {
    	root = null;
    }
    
    void addElement(String name)
    {
    	
            if(root == null)
            {
                root= new  Node(name);
                count++;
            }
            else
            {
                Node temp = root;
                while(temp.next != null)
                {
                    temp = temp.next;
                }
                temp.next = new Node(name);
                count++;
            }
    }
    
    void removeElement(String remname){
    	Node temp = root;
		Node prev=root;
		String str = "Deleted Contact Sucessfully";
		int mark=0;
		while(temp!=null)
		{
			if(remname.equals(root.name))
			{
				mark=1;
				root=temp.next;
				logger.info(str);
				temp = null;
			}
			else if(remname.equals(temp.name))
			{
					mark=1;
					logger.info(str);
					prev.next=prev.next.next;
					root = prev;
					break;
				
			}
			else
			{
				prev = temp;
				temp=temp.next;	
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
    	Node searchnode = root;
    	while(searchnode != null)
    	{
    		if(search.equals(searchnode.name))
    		{
    			flag = 1;
        		String a ="Name:"+searchnode.name;
    			logger.info(a);
    		}
    		searchnode = searchnode.next;
    	}
    	if(flag == 0)
    	{
    		logger.info("No Contact on the List");
    	}
    }
 
    void print()
    {
    	Node temp1 = root;
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
    			temp1 = temp1.next;
    		}
    		
    	}
    }
}
