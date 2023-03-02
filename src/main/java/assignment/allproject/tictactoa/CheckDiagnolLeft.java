package assignment.allproject.tictactoa;
class CheckDiagnolLeft extends Check
{
	CheckDiagnolLeft(int size,char[][] ch)
	{
		super(size,ch);
	}
    protected void check()
    {
    	int flag=0;
    	int flag1=0;
    	for(int i=0;i<ch.length;i++) //check left diagnole
    	{
    		if(ch[i][i]=='x')
    		{
    			flag++;
    		}
    		else if(ch[i][i]=='o')
    		{
    			flag1++;
    		}
    	}
    	winner(flag, flag1);
     }
}
