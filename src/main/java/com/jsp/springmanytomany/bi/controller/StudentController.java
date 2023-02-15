package com.jsp.springmanytomany.bi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jsp.springmanytomany.bi.dao.StudentDao;
import com.jsp.springmanytomany.bi.dto.Student;

@RestController
public class StudentController {

	@Autowired
	StudentDao studentDao;
	
	@PostMapping("/saveStudent")
	public void saveStudentSubject(@RequestBody List<Student> students) {

		studentDao.saveStudentSubject(students);
	}
}
