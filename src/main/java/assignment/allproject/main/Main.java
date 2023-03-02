package assignment.allproject.main;
import java.util.Scanner;
import java.util.logging.Logger;

import assignment.allproject.arraylist.MainClass;
import assignment.allproject.bank1.BankAccount;
import assignment.allproject.calculator.MainCalculator;
import assignment.allproject.card.MainCard;
import assignment.allproject.contact.MainContact;
import assignment.allproject.coordinates.MainCoordinate;
import assignment.allproject.datastructure.StudentTest;
import assignment.allproject.dbconnection.MainDB;
import assignment.allproject.file.MainFile;
import assignment.allproject.hashmap.MainHash;
import assignment.allproject.shape1.Shape1;
import assignment.allproject.student1.Student1;
import assignment.allproject.tictactoa.Tictactoa;


public class Main{
    public static void main(String[] args){
        Logger logger = Logger.getLogger("hi");
        Scanner sc = new Scanner(System.in);
        boolean b = true;
        while(b)
        {
            logger.info("Choose Your Option:\n1.ArrayList\n2.Bank\n3.Calculator\n4.contact\n5.card\n6.Coordinate\n7.Datastructure\n8.DBConnection\n9.File\n10.Hasmap\n11.Shape\n12.Student\n13.TicTacToa\n14.Exit");
            int option = sc.nextInt();
            switch(option)
            {
                case 1: MainClass.run();break;
                case 2: BankAccount.run();break;
                case 3: MainCalculator.run();break;
                case 4: MainContact.run();break;
                case 5: MainCard.run();break;
                case 6: MainCoordinate.run();break;
                case 7: StudentTest.run();break;
                case 8: MainDB.run();break;
                case 9: MainFile.run();break;
                case 10: MainHash.run();break;
                case 11: Shape1.run();break;
                case 12: Student1.run();break;
                case 13: Tictactoa.run();break;
                case 14: b=false;break;
                default : logger.info("Invalid");break;
            }
        }
    }
}