package com.vcs.emp;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.interceptor.ServletRequestAware;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ModelDriven;
import com.vcs.model.Employee;


public class EmployeeAction implements Action,ModelDriven<Employee>,ServletRequestAware {
	
	private static final long serialVersionUID = 1L;
	
	private Employee employee=new Employee();

	private HttpServletRequest request;

	/*public Employee getEmployee() {
		return employee;
	}


	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
*/

	public String execute() throws Exception {
		Thread.sleep(5000);
		String name=request.getParameter("name");
		System.out.println("execute");
		System.out.println("EmployeeName:"+employee.getEmpId());
		return SUCCESS;
	}


	@Override
	public Employee getModel() {
		return employee;
	}


	@Override
	public void setServletRequest(HttpServletRequest request) {
		
		this.request=request;
	}
	
}
