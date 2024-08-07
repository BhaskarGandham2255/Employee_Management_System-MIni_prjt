package EmployeeManagement.admin;
import java.sql.PreparedStatement;

import EmployeeManagement.DbConnection;
public class DeleteEmployeeDAO
{
	public int k;
	
	public int deleteEmployee(String eid)
	{
		try
		{
			PreparedStatement ps=DbConnection.getCon().prepareStatement("delete from empData where eid=?");
			ps.setString(1, eid);
			k=ps.executeUpdate();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return k;
	}
	
}
