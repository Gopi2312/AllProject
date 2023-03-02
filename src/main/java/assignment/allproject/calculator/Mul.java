package assignment.allproject.calculator;
class Mul extends Calculator
{
	Mul(double x , double y)
	{
		super(x,y);
	}
	protected double calculate()
	{
		return firstNumber * secondNumber;
	}
}