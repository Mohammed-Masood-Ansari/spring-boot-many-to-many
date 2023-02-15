package com.jsp.springmanytomany.bi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jsp.springmanytomany.bi.dao.SubjectDao;
import com.jsp.springmanytomany.bi.dto.Subject;

@RestController
public class SubjectController {

	@Autowired
	SubjectDao subjectDao;
	
	@PostMapping("/saveSubject")
	public void saveSubject(@RequestBody List<Subject> subjects) {

		subjectDao.saveSubject(subjects);
	}

}
