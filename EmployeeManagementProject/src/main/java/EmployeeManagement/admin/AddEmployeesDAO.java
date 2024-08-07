package EmployeeManagement.admin;
import java.sql.PreparedStatement;

import EmployeeManagement.DbConnection;
public class AddEmployeesDAO 
{
	public int k=0;
	
	public int addEmployee(String eid,String ename,String dept,String sal,String epword)
	{
		try
		{
		PreparedStatement ps=DbConnection.getCon().prepareStatement("insert into empData values(?,?,?,?,?)");
		ps.setString(1, eid);
		ps.setString(2, ename);
		ps.setString(3, dept);
		ps.setString(4, epword );
		ps.setLong(5, Long.parseLong(sal));
		k=ps.executeUpdate();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return k;
	}
}
