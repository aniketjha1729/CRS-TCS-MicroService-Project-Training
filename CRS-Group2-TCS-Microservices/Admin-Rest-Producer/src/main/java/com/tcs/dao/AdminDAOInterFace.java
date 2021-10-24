package com.tcs.dao;

import java.sql.SQLException;
import java.util.List;

public interface AdminDAOInterFace {

	/**
	 * Admin viewing all Courses using SQL commands
	 * 
	 * @throws SQLException
	 */
	List allCourses() throws SQLException;

}
