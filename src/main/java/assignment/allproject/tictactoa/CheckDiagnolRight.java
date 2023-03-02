package assignment.allproject.tictactoa;
class CheckDiagnolRight extends Check
{
	CheckDiagnolRight(int size,char[][] ch)
	{
		super(size,ch);
	}
	protected int check()
	{
    	int flag=0;
    	int flag1=0;
    	for(int j=0;j<ch.length;j++) //check right diagnole
    	{
    		for(int i=0;i<ch.length;i++)
    		{
    			if((i+j)== size-1)
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
    		}
    	}
    	return winner(flag, flag1);
    }
}
