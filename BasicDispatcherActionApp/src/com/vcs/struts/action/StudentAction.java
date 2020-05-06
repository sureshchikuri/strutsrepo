/*
 * Generated by MyEclipse Struts
 * Template path: templates/java/JavaClass.vtl
 */
package com.vcs.struts.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;
import com.vcs.struts.form.StudentForm;

/**
 * MyEclipse Struts Creation date: 01-27-2014
 * 
 * XDoclet definition:
 * 
 * @struts.action path="/student" name="studentForm" input="/student.jsp"
 *                parameter="something" scope="request" validate="true"
 * @struts.action-forward name="success" path="/success.jsp"
 */
public class StudentAction extends DispatchAction {
	/*
	 * Generated Methods
	 */

	/**
	 * Method execute
	 * 
	 * @param mapping
	 * @param form
	 * @param request
	 * @param response
	 * @return ActionForward
	 */
	public ActionForward insert(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response) {
		StudentForm studentForm = (StudentForm) form;
		System.out.println("insert");
		System.out.println("StudentNo:" + studentForm.getStudentNo());
		return mapping.findForward("success");
	}

	public ActionForward update(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response) {
		StudentForm studentForm = (StudentForm) form;
		System.out.println("StudentNo:" + studentForm.getStudentNo());
		return mapping.findForward("success");
	}
	
}