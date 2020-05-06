package com.vcs.emp;

import com.opensymphony.xwork2.ActionSupport;

public class EmployeeAction extends ActionSupport {

	private static final long serialVersionUID = 1L;

	private String empId;
	private String empName;
	private String empSal;

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String insert() {

		System.out.println("insert");

		return "success";
	}

	public String update() {

		System.out.println("update");

		return "success";
	}

	public void setEmpSal(String empSal) {
		this.empSal = empSal;
	}

	public String getEmpSal() {
		return empSal;
	}

	@Override
	public void validate() {

		if(getEmpName().length()==0){
			addActionError(getText("errors.empName"));
		}
	}
}
