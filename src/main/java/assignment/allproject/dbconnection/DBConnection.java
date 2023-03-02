package assignment.allproject.dbconnection;
import java.sql.DriverManager;
import java.sql.Connection;
import java.util.logging.*;
public class DBConnection {
	String database;
	String username;
	String password;
	static DBConnection singleInstance = null;
	Connection con = null;
	Logger log = Logger.getLogger("hi");
	private DBConnection(String database,String username, String password) {
		this.database = database;
		this.username = username;
		this.password = password;
	}
	public static DBConnection getInstance(String database,String username, String password) {
		if(singleInstance == null)
		{
			singleInstance = new DBConnection(database,username,password);
		}
		return singleInstance;
	}
	
	protected void connection()
	{
		try {
			con = DriverManager.getConnection(database,username,password);
			log.info("Connection Established");
		} 
		catch (Exception e) {
			log.info(String.valueOf(e));
		}	
	}
	
	protected void close()
	{
		try {
			con.close();
			log.info("Closed");
		} 
		catch (Exception e) {
			log.info(String.valueOf(e));
		}
	}
}