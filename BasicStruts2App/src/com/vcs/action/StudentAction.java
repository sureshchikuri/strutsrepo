package com.vcs.action;

public class StudentAction {

	private String studentNo;
	private String studentName;
	
	public String getStudentNo() {
		return studentNo;
	}

	public void setStudentNo(String studentNo) {
		this.studentNo = studentNo;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String insert(){
		
		System.out.println("execute");
		return "success";
		
	}
}
