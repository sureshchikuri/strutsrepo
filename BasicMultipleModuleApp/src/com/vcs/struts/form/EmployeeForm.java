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
 * Creation date: 01-01-2014
 * 
 * XDoclet definition:
 * @struts.form name="employeeForm"
 */
public class EmployeeForm extends ActionForm {
	/*
	 * Generated fields
	 */

	/** employeeNo property */
	private String employeeNo;

	/** employeename property */
	private String employeeName;

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
	 * Returns the employeeNo.
	 * @return String
	 */
	public String getEmployeeNo() {
		return employeeNo;
	}

	/** 
	 * Set the employeeNo.
	 * @param employeeNo The employeeNo to set
	 */
	public void setEmployeeNo(String employeeNo) {
		this.employeeNo = employeeNo;
	}

	/** 
	 * Returns the employeeName.
	 * @return String
	 */
	public String getEmployeeName() {
		return employeeName;
	}

	/** 
	 * Set the employeeName.
	 * @param employeename The employeeName to set
	 */
	public void setEmployeename(String employeeName) {
		this.employeeName = employeeName;
	}
}