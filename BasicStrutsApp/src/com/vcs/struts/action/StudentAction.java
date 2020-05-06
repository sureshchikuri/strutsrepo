/*
 * Generated by MyEclipse Struts
 * Template path: templates/java/JavaClass.vtl
 */
package com.vcs.struts.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import com.vcs.struts.form.StudentForm;

/** 
 * MyEclipse Struts
 * Creation date: 06-01-2014
 * 
 * XDoclet definition:
 * @struts.action path="/student" name="studentForm" input="/student.jsp" scope="request" validate="true"
 * @struts.action-forward name="success" path="/success.jsp"
 */
public class StudentAction extends Action {
	/*
	 * Generated Methods
	 */

	/** 
	 * Method execute
	 * @param mapping
	 * @param form
	 * @param request
	 * @param response
	 * @return ActionForward
	 */
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response) {
		StudentForm studentForm = (StudentForm) form;// TODO Auto-generated method stub
		System.out.println(studentForm.getStudentName());
		System.out.println(studentForm.getStudentName());
		return mapping.findForward("success");
	}  
}