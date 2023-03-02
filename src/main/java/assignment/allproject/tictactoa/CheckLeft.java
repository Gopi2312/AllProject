package assignment.allproject.tictactoa;

class CheckLeft extends Check
{
	CheckLeft(int size,char[][] ch)
	{
		super(size,ch);
	}
	protected int check()
    	{
		int m =0;
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
    		return m = winner(flag, flag1);
    	}
    	return m;
    }
}   

