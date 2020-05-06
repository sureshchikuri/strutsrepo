package com.vcs.action;

import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.interceptor.ServletRequestAware;

import com.opensymphony.xwork2.ModelDriven;
import com.vcs.model.Student;

public class StudentAction implements ModelDriven<Student>,ServletRequestAware{

	private Student student;
	private ServletRequest request;
	
	public String execute(){
		
		System.out.println("StudentNo:"+student.getStudentNo());
		System.out.println("SerReq:"+request);
		return "success";
		
	}

		public void setStudent(Student student) {
		this.student = student;
	}

	public Student getStudent() {
		return student;
	}

	@Override
	public Student getModel() {
		
		return student;
	}

	@Override
	public void setServletRequest(HttpServletRequest request) {

		this.request=request;
	}
}
