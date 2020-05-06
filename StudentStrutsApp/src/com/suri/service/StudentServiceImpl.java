package com.suri.service;

import com.suri.dao.StudentDao;
import com.suri.pojo.Student;

public class StudentServiceImpl implements StudentService {

	private StudentDao studentDao;

	public void setStudentDao(StudentDao studentDao) {
		this.studentDao = studentDao;
	}

	public String insertStudent(Student student2) {

		String status = null;

		status = studentDao.insertStudent(student2);
		return status;
	}
}
