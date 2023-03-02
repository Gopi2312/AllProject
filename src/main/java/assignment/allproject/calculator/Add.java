package assignment.allproject.calculator;

import java.util.logging.Level;

class Add extends Calculator
{
	Add(double x , double y)
	{
		super(x,y);
	}
	protected double calculate()
	{
		try {
			return firstNumber + secondNumber;
		}
		catch(Exception e)
		{
			logger.log(Level.INFO,()->""+e);
			return 0;
			
		}
	}
}