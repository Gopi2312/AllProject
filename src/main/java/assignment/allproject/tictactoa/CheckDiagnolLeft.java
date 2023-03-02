package assignment.allproject.tictactoa;
class CheckDiagnolLeft extends Check
{
	CheckDiagnolLeft(int size,char[][] ch)
	{
		super(size,ch);
	}
    protected int check()
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
    	return winner(flag, flag1);
     }
}
