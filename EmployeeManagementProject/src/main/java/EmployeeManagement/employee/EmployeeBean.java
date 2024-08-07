package EmployeeManagement.employee;
import java.io.*;
@SuppressWarnings("serial")
public class EmployeeBean implements Serializable
{
	private String eid,ename,dept,pword	;

	private long sal;
	
	public EmployeeBean()
	{
		//0 parameter constructor
	}

	public String getEid() {
		return eid;
	}

	public void setEid(String eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public long getSal() {
		return sal;
	}

	public void setSal(long sal) {
		this.sal = sal;
	}
	
	public String getPword() {
		return pword;
	}

	public void setPword(String pword) {
		this.pword = pword;
	}

}
