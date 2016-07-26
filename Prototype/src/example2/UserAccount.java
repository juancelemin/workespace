package example2;

import java.util.ArrayList;

public class UserAccount {
	private String userName = "nnanna";
	private String password;
	private String fname;
	private String lname;
	private ArrayList<Object> permissions = new ArrayList<>();

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public ArrayList<Object> getUpermissions() {
		return permissions;
	}

	public void setUpermissions(ArrayList<Object> upermissions) {
		this.permissions = upermissions;
	}

	public Object clone() {
		try {
			return super.clone();
		} catch (CloneNotSupportedException e) {
			return null;
		}
	}

	@Override
	public String toString() {
		return "UserAccount [userName=" + userName + ", password=" + password + ", fname=" + fname + ", lname=" + lname
				+ ", permissions=" + permissions + "]";
	}
	

}
