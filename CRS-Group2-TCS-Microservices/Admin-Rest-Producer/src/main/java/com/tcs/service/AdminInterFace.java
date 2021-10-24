/**
 * 
 */
package com.tcs.service;

import java.sql.SQLException;
import java.util.List;

/**
 * @author Aniket
 *
 */
public interface AdminInterFace {
	/**
	 * Admin viewing all Courses using SQL commands
	 * 
	 * @throws NoCourseFoundException
	 */
	List getAllCourses() throws SQLException;

}
