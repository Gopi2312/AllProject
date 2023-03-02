package assignment.allproject.tictactoa;

class CheckLeft extends Check
{
	CheckLeft(int size,char[][] ch)
	{
		super(size,ch);
	}
	protected void check()
    {
    	for(int j=0;j<ch.length;j++) //checkcolumn
    	{
    		int flag = 0;
        	int flag1 = 0;
    		for(int i=0;i<ch.length;i++)
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
    		winner(flag, flag1);
    	}
    }
}   
