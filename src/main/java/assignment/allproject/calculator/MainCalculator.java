package assignment.allproject.calculator;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
public class MainCalculator 
{
	protected MainCalculator() {
		
	}
    public static void run()
    {
    	double firstNumber;
    	double secondNumber;
    	double result;
    	int n = 0;
    	Scanner sc = new Scanner(System.in);
	Logger logger = Logger.getLogger("hi");
    	String msg = "Enter Number";
    	logger.info(msg);
    	firstNumber = sc.nextDouble();
    	Calculator obj;
    	result = firstNumber;
    	while(n == 0)
    	{
    		try {
	        	logger.info(msg);
	        	secondNumber = sc.nextDouble();
	        	logger.info("Choose Operation:\n addition: +\n substraction: -\n multiple:*\n division:/\n exit:e");
	        	char op = sc.next().charAt(0);
	        	switch(op)
	        	{
	        		case '+':
	        		{
	        			obj = new Add(result,secondNumber);
	        			result = obj.calculate();
	        			break;	
	        		}
	        		case '-':
	        		{
	        			obj = new Sub(result,secondNumber);
	        			result = obj.calculate();
	        			break;	
	        		}
	        		case '*':
	        		{
	        			obj = new Mul(result,secondNumber);
	        			result = obj.calculate();
	        			break;	
	        		}
	        		case '/':
	        		{
	        			obj = new Div(result,secondNumber);
	        			result = obj.calculate();
	        			break;	
	        		}
	        		case 'e':
	        		{
	        			n=1;
	        			break;
	        		}
	        		default:
	        		{
	        			logger.info("Invalid Option");
	        			break;
	        		}
	        	}
    		}
    		catch(Exception e)
        	{
        		logger.log(Level.INFO,()->""+e);
        		sc.nextLine();
        	}
        	String res = String.valueOf(result);
        	logger.info(res);
    	}
    }
}
