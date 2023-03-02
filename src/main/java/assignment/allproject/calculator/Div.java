package assignment.allproject.calculator;
class Div extends Calculator
{
	Div(double x , double y)
	{
		super(x,y);
	}
	protected double calculate()
	{
		return firstNumber / secondNumber;
	}
}