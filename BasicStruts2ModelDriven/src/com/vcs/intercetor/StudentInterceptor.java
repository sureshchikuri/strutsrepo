package com.vcs.intercetor;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

public class StudentInterceptor extends AbstractInterceptor {

	@Override
	public String intercept(ActionInvocation actionInvocation) throws Exception {

		System.out.println("pre");
		String result=actionInvocation.invoke();
		System.out.println("post");
		return result;
	}

}
