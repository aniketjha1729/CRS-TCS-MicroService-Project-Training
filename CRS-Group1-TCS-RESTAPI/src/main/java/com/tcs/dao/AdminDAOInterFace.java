/**
 * 
 */
package com.tcs.dao;

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
public interface AdminDAOInterFace {
	/**
	 * Admin login using SQL commands
	 * @param adminuserName
	 * @param adminPassword
	 * @throws UserNotFoundException 
	 */
	public boolean adminLogin(String adminuserName, String adminPassword) throws UserNotFoundException;
	
	
	/**
	 * Admin viewing all Courses using SQL commands
	 * @throws NoCourseFoundException 
	 */
	public List<Course> viewCourse();
	
	
	
	/**
	 * Admin adding new courses using SQL commands
	 * @param course
	 * @throws CourseFoundException 
	 */
	public void addCourse(Course course) throws CourseFoundException;
	
	
	/**
	 * Admin viewing all Courses using SQL commands
	 * @throws SQLException 
	 */
	public List allCourses() throws SQLException;
	
	
	
	/**
	 * Admin assigning courses using SQL commands
	 * @param courseCode
	 * @param instructorId
	 * @throws UserNotFoundException 
	 */
	public void assignCourse(String courseCode, String instructorId) throws UserNotFoundException;
	
	
	
	/**
	 * Admin delte course using SQL commands
	 * @param courseCode
	 * @throws SQLException 
	 */
	public Course deleteCourse(String courseCode) throws SQLException;
	
	
	
	/**
	 * Admin listing all professor using SQL commands
	 * @throws SQLException 
	 */
	public List Professors() throws SQLException;
	
	/**
	 * Fetch Students yet to approved using SQL commands
	 * @return List of Students yet to approved
	 * @throws SQLException 
	 */
	public List<Student> viewPendingAdmissions() throws SQLException;
	
	/**
	 * Approve Student using SQL commands
	 * @param studentId
	 * @throws StudentNotFoundException
	 */
	public void approveStudent(int studentId) throws StudentNotFoundForApprovalException;

}
