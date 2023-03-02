package assignment.allproject.tictactoa;
class CheckRight extends Check
{
	CheckRight(int size,char[][] ch)
	{
		super(size,ch);
	}
	protected int check()
    	{
		int n=0;
    	for(int i=0;i<ch.length;i++) //checkrow
    	{
    		int flag = 0;
        	int flag1 = 0;
    		for(int j=0;j<ch.length;j++)
    		{
    			if(ch[i][j]== 'x')
    			{
    				flag++;
    			}
    			else if(ch[i][j]== 'o')
    			{
    				flag1++;
    			}
    		}
    		n = winner(flag, flag1);
    		if(n==size*size+1)
    		{
    			return n;
    		}
    	}
    	return n;
    }
}
