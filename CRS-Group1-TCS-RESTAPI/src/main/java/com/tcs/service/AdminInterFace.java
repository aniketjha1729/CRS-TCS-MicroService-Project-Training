/**
 * 
 */
package com.tcs.service;

import java.sql.SQLException;
import java.util.List;

import com.tcs.bean.Course;
import com.tcs.bean.Student;
import com.tcs.exception.CourseFoundException;
import com.tcs.exception.StudentNotFoundForApprovalException;
import com.tcs.exception.UserNotFoundException;

/**
 * @author Aniket
 *
 */
public interface AdminInterFace {
	/**
	 * Admin login using SQL commands
	 * @param adminuserName
	 * @param adminPassword
	 * @throws UserNotFoundException 
	 */
	boolean loginAdmin(String adminuserName, String adminPassword) throws UserNotFoundException;
	
	
	/**
	 * Admin viewing all Courses using SQL commands
	 * @throws NoCourseFoundException 
	 */
	List<Course> viewCourses();
	
	
	/**
	 * Admin adding new courses using SQL commands
	 * @param course
	 * @throws CourseFoundException 
	 */
	void addCourse(Course course, List<Course> courseList) throws CourseFoundException;
	
	
	/**
	 * Admin viewing all Courses using SQL commands
	 * @throws NoCourseFoundException 
	 */
	List getAllCourses() throws SQLException;
	
	
	/**
	 * Admin assigning courses using SQL commands
	 * @param courseCode
	 * @param instructorId
	 * @throws UserNotFoundException 
	 */
	void assignCourse(String courseCode, String instructorId) throws UserNotFoundException ;
	
	
	/**
	 * Admin delte course using SQL commands
	 * @param courseCode
	 * @throws SQLException 
	 */
	Course deleteCourse(String courseCode) throws SQLException;
	
	
	/**
	 * Admin listing all professor using SQL commands
	 * @throws SQLException 
	 */
	List getAllProfessors() throws SQLException;
	
	/**
	 * Method to view Students yet to be approved by Admin
	 * @return List of Students with pending admissions
	 * @throws SQLException 
	 */
	public List<Student> viewPendingAdmissions() throws SQLException;
	
	/**
	 * Method to approve a Student 
	 * @param studentId 
	 * @throws StudentNotFoundForApprovalException 
	 */
	public void approveStudent(int studentId) throws StudentNotFoundForApprovalException;
	
}
