/**
 * 
 */
package com.springrest.bugg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.bugg.entity.Course;
import com.springrest.bugg.services.CourseService;

/**
 * @author Aniket
 *
 */
@RestController
public class MyController {
	
	@Autowired
	private CourseService courseService;
	
	@GetMapping("/home")
	public String home() {
		return "Home";
	}
	
	@GetMapping("/courses")
	public List<Course> getCourses(){
		return this.courseService.getCourses();
	}
	
	@GetMapping("/course/{courseId}")
	public Course getCourse(@PathVariable long courseId ) {
		return this.courseService.getCourse(courseId);
	}
	
	@PostMapping("/course")
	public Course addCourse(@RequestBody Course course) {
		return this.courseService.addCourse(course);
	}
}
