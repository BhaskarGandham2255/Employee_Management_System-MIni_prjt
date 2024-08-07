package EmployeeManagement.admin;
import java.sql.PreparedStatement;

import EmployeeManagement.DbConnection;
public class EditEmployeeDAO
{
	public int k;
	
	public int editEmployee(String eid,String ename,String dept,long sal)
	{
		try
		{
			PreparedStatement ps=DbConnection.getCon().prepareStatement("update empData set ename=?,dept=?,sal=? where eid=?");
			ps.setString(1, ename);
			ps.setString(2, dept);
			ps.setLong(3, sal);
			ps.setString(4, eid);
			k=ps.executeUpdate();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return k;
	}
}
