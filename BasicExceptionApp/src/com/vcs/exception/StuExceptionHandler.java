package com.vcs.exception;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;
import org.apache.struts.action.ExceptionHandler;
import org.apache.struts.config.ExceptionConfig;

public class StuExceptionHandler extends ExceptionHandler {
	
	@Override
	public ActionForward execute(Exception ex, ExceptionConfig ae,
			ActionMapping mapping, ActionForm formInstance,
			HttpServletRequest request, HttpServletResponse response)
			throws ServletException {
		
		int errorCode=11;
		System.out.println("StuAppExceptionHandler.execute()");
		
		ActionForward forward=new ActionForward();
		ActionMessage error=null;
		String property=null;
		
		try{
			
			error=new ActionMessage(ae.getKey(),ex.getMessage());
			property=ae.getKey();
		}catch (Exception e) {
			e.printStackTrace();
		}
			System.out.println("errorCode:"+errorCode);
			request.setAttribute("errorCode", errorCode);
		return forward;
	}

}
