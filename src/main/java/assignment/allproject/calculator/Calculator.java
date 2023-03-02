package assignment.allproject.calculator;

import java.util.logging.Logger;

abstract class Calculator 
{
	double firstNumber;
	double secondNumber;
	Logger logger = Logger.getLogger("hi");
	Calculator(double x , double y)
	{
		this.firstNumber = x;
		this.secondNumber = y;
	}
	protected abstract double calculate();
}
