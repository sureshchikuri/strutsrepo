/*
 * Generated by MyEclipse Struts
 * Template path: templates/java/JavaClass.vtl
 */
package com.vcs.struts.form;

import java.util.List;

import org.apache.struts.action.ActionForm;

/** 
 * MyEclipse Struts
 * Creation date: 01-08-2014
 * 
 * XDoclet definition:
 * @struts.form name="studentForm"
 */
public class StudentForm extends ActionForm {
	
	private List studentList;

	public void setStudentList(List studentList) {
		this.studentList = studentList;
	}

	public List getStudentList() {
		return studentList;
	}

	
}