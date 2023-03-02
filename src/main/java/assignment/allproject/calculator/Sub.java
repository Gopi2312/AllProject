package assignment.allproject.calculator;
class Sub extends Calculator
{
	Sub(double x , double y)
	{
		super(x,y);
	}
	protected double calculate()
	{
		return firstNumber - secondNumber;
	}
}