package com.vcs.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class HelloServlet extends GenericServlet {
	public void service(ServletRequest req, ServletResponse res)
			throws ServletException, IOException {
		PrintWriter pw = res.getWriter();
		pw.print("<h1>studentName</h1>"+getInitParameter("studentName"));
	}

}
