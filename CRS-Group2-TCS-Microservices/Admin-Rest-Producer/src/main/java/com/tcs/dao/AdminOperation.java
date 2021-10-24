/**
 * 
 */
package com.tcs.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.tcs.bean.Course;
import com.tcs.constant.SQLQueriesConstants;
import com.tcs.utils.DBUtils;

/**
 * @author Aniket
 *
 */
@Repository
public class AdminOperation implements AdminDAOInterFace {

	@Override
	public List allCourses() throws SQLException {
		
		Connection connection = DBUtils.getConnection();
		
		// TODO Auto-generated method stub
		List<Course> courses = new ArrayList<Course>();
		PreparedStatement stmt = connection.prepareStatement(SQLQueriesConstants.ADMIN_FETCH_COURSES);
		ResultSet rs = stmt.executeQuery();
		while (rs.next()) {
			courses.add(new Course(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getInt(5)));
		}
		return courses;
	}

}
