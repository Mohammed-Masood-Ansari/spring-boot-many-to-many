package com.jsp.springmanytomany.bi.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jsp.springmanytomany.bi.dto.Subject;
import com.jsp.springmanytomany.bi.repository.SubjectRepository;

@Repository
public class SubjectDao {

	@Autowired
	SubjectRepository repository;
	
	public void saveSubject(List<Subject> subjects) {
		
		repository.saveAll(subjects);
	}
}
