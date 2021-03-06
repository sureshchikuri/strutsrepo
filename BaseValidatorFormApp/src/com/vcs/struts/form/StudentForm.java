/*
 * Generated by MyEclipse Struts
 * Template path: templates/java/JavaClass.vtl
 */
package com.vcs.struts.form;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.validator.ValidatorForm;

/** 
 * MyEclipse Struts
 * Creation date: 01-25-2014
 * 
 * XDoclet definition:
 * @struts.form name="studentForm"
 */
public class StudentForm extends ValidatorForm {
	/*
	 * Generated fields
	 */

	/** studentNo property */
	private String studentNo;

	/** studentName property */
	private String studentName;

	/*
	 * Generated Methods
	 */

	/** 
	 * Method validate
	 * @param mapping
	 * @param request
	 * @return ActionErrors
	 */

	/** 
	 * Returns the studentNo.
	 * @return String
	 */
	public String getStudentNo() {
		return studentNo;
	}

	/** 
	 * Set the studentNo.
	 * @param studentNo The studentNo to set
	 */
	public void setStudentNo(String studentNo) {
		this.studentNo = studentNo;
	}

	/** 
	 * Returns the studentName.
	 * @return String
	 */
	public String getStudentName() {
		return studentName;
	}

	/** 
	 * Set the studentName.
	 * @param studentName The studentName to set
	 */
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	@Override
	public ActionErrors validate(ActionMapping mapping,
			HttpServletRequest request) {
		// TODO Auto-generated method stub
		
		ActionErrors ae=super.validate(mapping, request);
		System.out.println("Errors:"+ae);
		return ae;
	}
}