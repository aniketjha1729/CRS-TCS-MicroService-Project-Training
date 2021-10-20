package com.springrest.bugg.services;

import java.util.List;

import com.springrest.bugg.entity.Course;

public interface CourseService {
	public List<Course> getCourses();
	public Course getCourse(long courseId);
	public Course addCourse(Course course);
}
