package com.springrest.bugg.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springrest.bugg.entity.Course;

public interface CourseDAO  extends JpaRepository<Course, Long> {
	
}
