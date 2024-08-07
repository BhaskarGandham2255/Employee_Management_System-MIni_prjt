package EmployeeManagement.admin;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

import EmployeeManagement.DbConnection;
public class AdminLoginDAO
{
	public AdminBean ab=null;
	
	public AdminBean check(String un,String up)
	{
		try
		{
			PreparedStatement ps=DbConnection.getCon().prepareStatement("select * from adminData where uname=? and pword=?");
			ps.setString(1, un);
			ps.setString(2, up);
			ResultSet rs=ps.executeQuery();
			if(rs.next())
			{
				ab=new AdminBean();
				ab.setId(rs.getString(1));
				ab.setUname(rs.getString(2));
				ab.setPword(rs.getString(3));
				ab.setFname(rs.getString(4));
				ab.setLname(rs.getString(5));		
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return ab;
	}
}
