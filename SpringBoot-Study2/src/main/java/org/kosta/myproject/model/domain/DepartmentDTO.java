package org.kosta.myproject.model.domain;

public class DepartmentDTO {
	private int deptNo;
	private String dname;
	private String loc;
	public DepartmentDTO() { //기본생성자 
		super();
	}
	public int getDeptNo() {
		return deptNo;
	}
	public void setDeptNo(int deptNo) {
		this.deptNo = deptNo;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}
	@Override
	public String toString() {
		return "DepartmentDTO [deptNo=" + deptNo + ", dname=" + dname + ", loc=" + loc + "]";
	}
}
