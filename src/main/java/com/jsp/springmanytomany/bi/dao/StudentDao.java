package com.jsp.springmanytomany.bi.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jsp.springmanytomany.bi.dto.Student;
import com.jsp.springmanytomany.bi.repository.StudentRepository;

@Repository
public class StudentDao {

	@Autowired
	StudentRepository repository;
	
	public void saveStudentSubject(List<Student> students) {
		
		repository.saveAll(students);
	}
}
