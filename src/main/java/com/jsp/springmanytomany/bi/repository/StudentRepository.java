package com.jsp.springmanytomany.bi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jsp.springmanytomany.bi.dto.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}
