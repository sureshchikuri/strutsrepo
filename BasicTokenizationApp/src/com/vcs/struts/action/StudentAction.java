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

public class StudentAction extends Action {

	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response) {
		StudentForm studentForm = (StudentForm) form;
		ActionForward forward=null;
		try {
			System.out.println("SAction.execute()");
			Thread.sleep(5000);
			if(isTokenValid(request,true)){
				forward=mapping.findForward("success");
			}else{
				forward=mapping.findForward("failure");
			}
		} catch (InterruptedException e) {
			System.err.println("InterruptedException:" + e);
		}
		return forward;
	}
}