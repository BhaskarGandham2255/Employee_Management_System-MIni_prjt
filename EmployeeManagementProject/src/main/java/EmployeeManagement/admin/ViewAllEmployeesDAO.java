package EmployeeManagement.admin;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import EmployeeManagement.DbConnection;
import EmployeeManagement.employee.EmployeeBean;
public class ViewAllEmployeesDAO 
{
	public ArrayList<EmployeeBean> al=null;
    
	public ArrayList<EmployeeBean> viewAll()
	{
		try
		{
			  PreparedStatement ps=DbConnection.getCon().prepareStatement("select * from empData");
			  ResultSet rs=ps.executeQuery();
			  al=new ArrayList<EmployeeBean>();
			  while(rs.next())
			  {
				 EmployeeBean eb=new EmployeeBean();
				 eb.setEid(rs.getString(1));
				 eb.setEname(rs.getString(2));
				 eb.setDept(rs.getString(3));
				 eb.setPword(rs.getString(4));
				 eb.setSal(rs.getLong(5));
				 al.add(eb);  
			  }
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return al;
	}
}
