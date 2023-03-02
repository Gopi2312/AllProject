package assignment.allproject.tictactoa;

import java.util.logging.Logger;

abstract class Check
{
	Logger logger = Logger.getLogger("hi");
	int size;
	char[][] ch;
    String str1 = "Player 1 Winner";
    String str2 = "Player 2 Winner";
	Check(int size,char[][] ch)
	{
		this.size = size;
		this.ch = ch;
	}
	protected void winner(int flag,int flag1)
	{
		if(flag == size)
		{
			logger.info(str1);
			Tictactoa.i = 10;
		}
		if(flag1 == size)
		{
			logger.info(str2);
			Tictactoa.i=10;
		}
	}
    protected abstract void check();
}