/*
 * Generated by MyEclipse Struts
 * Template path: templates/java/JavaClass.vtl
 */
package com.vcs.struts.action;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.vcs.struts.floor.Student;
import com.vcs.struts.form.StudentForm;

/** 
 * MyEclipse Struts
 * Creation date: 01-08-2014
 * 
 * XDoclet definition:
 * @struts.action path="/student" name="studentForm" input="/student.jsp" scope="request" validate="true"
 * @struts.action-forward name="student" path="/student.jsp"
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
		StudentForm studentForm = (StudentForm) form;

		List studentList=new ArrayList();
		Student student=null;
		for(int i=0;i<10;i++){
			student =new Student();
			student.setStudentNo(""+i);
			student.setStudentName("vcs"+i);
			student.setEmail("vcs"+i+"@vcs.com");
			studentList.add(student);
		}
			request.setAttribute("studentList", studentList);
			studentForm.setStudentList(studentList);
		
		return mapping.findForward("success");
	}
}