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

import com.vcs.model.State;

/** 
 * MyEclipse Struts
 * Creation date: 01-18-2014
 * 
 * XDoclet definition:
 * @struts.action validate="true"
 * @struts.action-forward name="student" path="/student.jsp"
 */
public class StudentPreAction extends Action {
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
		// TODO Auto-generated method stub
		
		State state =null;
		
		List<State> stateList=new ArrayList<State>();
		
		for(int i=0;i<=10;i++){
			
			state=new State();
			state.setStateId(""+i);
			state.setStateName("VCS"+i);
			stateList.add(state);
		}
		
		request.setAttribute("stateList", stateList);
		
		return mapping.findForward("student");
	}
}