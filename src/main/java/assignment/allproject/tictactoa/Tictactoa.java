package assignment.allproject.tictactoa;
import java.util.Scanner;
import java.util.logging.Logger;
public class Tictactoa
{
    public static void main( String[] args )
    {
        Logger l = Logger.getLogger("hi");
        Scanner sc = new Scanner(System.in);
        XoBoard obj = new XoBoard();
        int position;
        int size=obj.size;
        int i=0;
        int last = 0;
        obj.printArray();
        l.info("Player 1  x");
        l.info("Player 2  o");
        while(i<size*size && last != size*size+1)
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
                last = obj.player();
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
                last = obj.player();
            }
            i++;
            if(i>=9)
            {
            	l.info("Draw");
            }
        }  
    }  
}
