/*
 * Generated by MyEclipse Struts
 * Template path: templates/java/JavaClass.vtl
 */
package com.vcs.struts.form;

import javax.servlet.http.HttpServletRequest;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

/** 
 * MyEclipse Struts
 * Creation date: 01-08-2014
 * 
 * XDoclet definition:
 * @struts.form name="studentForm"
 */
public class StudentForm extends ActionForm {
	/*
	 * Generated fields
	 */

	/** studentCourse property */
	private String studentCourse;

	/*
	 * Generated Methods
	 */

	/** 
	 * Method validate
	 * @param mapping
	 * @param request
	 * @return ActionErrors
	 */
	public ActionErrors validate(ActionMapping mapping,
			HttpServletRequest request) {
		// TODO Auto-generated method stub
		return null;
	}

	/** 
	 * Method reset
	 * @param mapping
	 * @param request
	 */
	

	/** 
	 * Returns the studentCourse.
	 * @return String
	 */
	public String getStudentCourse() {
		return studentCourse;
	}

	/** 
	 * Set the studentCourse.
	 * @param studentCourse The studentCourse to set
	 */
	public void setStudentCourse(String studentCourse) {
		this.studentCourse = studentCourse;
	}
	public void reset(ActionMapping mapping, HttpServletRequest request) {
		// TODO Auto-generated method stub
		this.studentCourse=null;
	}
}