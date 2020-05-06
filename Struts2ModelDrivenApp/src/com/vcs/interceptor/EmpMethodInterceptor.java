package com.vcs.interceptor;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.MethodFilterInterceptor;

public class EmpMethodInterceptor extends MethodFilterInterceptor {

	
	private static final long serialVersionUID = 1L;

	@Override
	protected String doIntercept(ActionInvocation actionInvocation) throws Exception {

		System.out.println("start");
		String result=actionInvocation.invoke();
		System.out.println("End");
		return result;
	}

}
