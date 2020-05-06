package com.suri.dao;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.suri.pojo.Student;

public class StudentDaoImpl extends HibernateDaoSupport implements StudentDao {

	public String insertStudent(Student student2) {
		String status = null;

		getSession().save(student2);

		status = "inserted successfully";

		return status;
	}

}
