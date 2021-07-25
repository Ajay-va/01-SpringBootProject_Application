package com.example.demo;

public class PersonDetails {

	
	private int pid;
	private String pname;
	private String paddress;
	public PersonDetails(int pid, String pname, String paddress) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.paddress = paddress;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getPaddress() {
		return paddress;
	}
	public void setPaddress(String paddress) {
		this.paddress = paddress;
	}
	@Override
	public String toString() {
		return "PersonDetails [pid=" + pid + ", pname=" + pname + ", paddress=" + paddress + "]";
	}
	
	
}
