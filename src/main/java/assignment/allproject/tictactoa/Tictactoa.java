package assignment.allproject.tictactoa;
import java.util.Scanner;
import java.util.logging.Logger;
public class Tictactoa
{
	
	protected Tictactoa() {
		
	}
	public static int i;
    public static void run()
    {
	Logger l = Logger.getLogger("hi");
        Scanner sc = new Scanner(System.in);
        XoBoard obj = new XoBoard();
        int position;
        int size=obj.size;
        i=0;
        obj.printArray();
        l.info("Player 1  x");
        l.info("Player 2  o");
        while(i<size*size)
        {
            if(i%2==0)
            {
                l.info("Enter the position");
                position = sc.nextInt();
                int x = obj.insert(position,'x');
                if(x==1)
                {
                	i--;
                }
                obj.printArray();
                obj.player();   
            }
            else
            {
                l.info("Enter the position");
                position = sc.nextInt();
                int x = obj.insert(position,'o');
                if(x==1)
                {
                	i--;
                }
                obj.printArray();
                obj.player();
            }
            i++;
            if(i>=9)
            {
            	l.info("Draw");
            }
        }  
    }  
}
