package com.jsp.springmanytomany.bi.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;

@Entity
public class Subject {

	@Id
	@Column(name = "subjectid")
	private int subjectId;
	
	@Column(name = "subjectname")
	private String subjectName;
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "studentsubject",
	joinColumns = {
			
			@JoinColumn(name="subjectid")
			
	},
	inverseJoinColumns = {
			@JoinColumn(name="studentid")
	})
	List<Student> students;

	public int getSubjectId() {
		return subjectId;
	}

	public void setSubjectId(int subjectId) {
		this.subjectId = subjectId;
	}

	public String getSubjectName() {
		return subjectName;
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}

	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}
	
	
	
	
}
