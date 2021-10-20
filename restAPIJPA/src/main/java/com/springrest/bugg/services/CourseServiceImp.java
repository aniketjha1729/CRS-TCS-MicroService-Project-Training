/**
 * 
 */
package com.springrest.bugg.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springrest.bugg.dao.CourseDAO;
import com.springrest.bugg.entity.Course;

/**
 * @author Aniket
 *
 */
@Service
public class CourseServiceImp implements CourseService {
	
	@Autowired
	private CourseDAO courseDao;
	
	//List<Course> list;
	
	public CourseServiceImp() {
//		list=new ArrayList<>();
//		list.add(new Course(145,"java","hello"));
//		list.add(new Course(160,"java1","hello1212"));
	}


	@Override
	public List<Course> getCourses() {
		// TODO Auto-generated method stub
		return courseDao.findAll();
		
	}

	
	@Override
	public Course getCourse(long courseId) {
		// TODO Auto-generated method stub
//		Course c=null;
//		for(Course course:list) {
//			if(course.getId()==courseId) {
//				c=course;
//				break;
//			}
//		}
		return courseDao.getOne(courseId);
	}


	@Override
	public Course addCourse(Course course) {
		// TODO Auto-generated method stub
		//list.add(course);
		courseDao.save(course);
		return course;
	}

}
