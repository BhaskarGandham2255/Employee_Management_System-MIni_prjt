package EmployeeManagement;
import java.sql.*;
public class DbConnection 
{
	private static Connection con=null;
	
	
    //Private 0 param constructor
	private DbConnection()
	{	
	  //others can't create object for this	
	}
	static
	{
		 try
		 {
			Class.forName(DbInfo.DbDriver);
			con=DriverManager.getConnection(DbInfo.DbUrl,DbInfo.DbName,DbInfo.DbPword);
		 }
		 catch(Exception e)
		 {
			 e.printStackTrace();
		 }
	}
	
	public static Connection getCon()
	{
		 return con;
	}
}
