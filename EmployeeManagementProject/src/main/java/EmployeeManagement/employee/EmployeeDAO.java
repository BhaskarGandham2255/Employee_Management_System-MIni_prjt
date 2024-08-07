package EmployeeManagement.employee;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import EmployeeManagement.DbConnection;
public class EmployeeDAO 
{
	EmployeeBean eb;
	
	public EmployeeBean check(String ename,String Pword)
	{
		
		try
		{                                                                                 
			PreparedStatement ps=DbConnection.getCon().prepareStatement("select * from empData where ename=? and pword=?");
			ps.setString(1,ename);                                                          
			ps.setString(2,Pword);
			ResultSet rs=ps.executeQuery();
			if(rs.next())
			{
				eb=new EmployeeBean();
				eb.setEid(rs.getString(1));
				eb.setEname(rs.getString(2));
				eb.setDept(rs.getString(3));
				eb.setPword(rs.getString(4));
				eb.setSal(rs.getLong(5));
			}
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return eb;
	}
}
