package assignment.allproject.card;
import java.util.logging.*;
public class TestCard implements Cloneable{
	Long cardnum;
	String cardname;
	String exdate;
	Logger log = Logger.getLogger("hi");
	TestCard(String cardname,Long cardnum,String exdate)
	{
		this.cardnum = cardnum;
		this.cardname = cardname;
		this.exdate = exdate;
	}
	protected TestCard clo()
	{
		try{
    		return (TestCard)super.clone();
    		}
		catch(CloneNotSupportedException e)
		{
			log.info("Clowning error");
			return this;
		}
	}
	protected boolean test(Long valnum)
	{
		return valnum.equals(cardnum);
	}
}