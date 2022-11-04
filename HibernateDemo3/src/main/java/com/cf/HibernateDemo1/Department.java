package com.cf.HibernateDemo1;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Department {

	@Id//PK
	@Column(name = "dept_id")	
	private int deptId;
	@Column(name = "dept_name")
	private String deptName;
	
	public Department() {
		// TODO Auto-generated constructor stub
	}

	public int getDeptId() {
		return deptId;
	}

	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	@Override
	public String toString() {
		return "Department [dept_id=" + deptId + ", deptName=" + deptName + "]";
	}
	
}
