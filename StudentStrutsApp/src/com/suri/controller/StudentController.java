package com.suri.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.beanutils.BeanUtils;
import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;

import com.suri.command.StudentCommand;
import com.suri.pojo.Student;
import com.suri.service.StudentService;

public class StudentController extends SimpleFormController {
	
	private StudentService studentService ;
	
	public void setStudentService(StudentService studentService) {
		this.studentService = studentService;
	}
	
	@Override
	protected Object formBackingObject(HttpServletRequest request)
			throws Exception {
		StudentCommand student = new StudentCommand();

		student.setStudentNo("111");

		return student;
	}
	
	@Override
	protected ModelAndView onSubmit(HttpServletRequest request,
			HttpServletResponse response, Object command, BindException errors)
			throws Exception {
		
		String status = null;
		
		StudentCommand studentCommand = (StudentCommand)command;
		
		Student student2 = new Student();
		
		BeanUtils.copyProperties(studentCommand,student2);
		
		studentCommand.setStudentName("suresh");
		studentCommand.setStudentNo("101");
		
		status = studentService.insertStudent(student2);
		System.out.println(status);
		return new ModelAndView("success");	}

}
