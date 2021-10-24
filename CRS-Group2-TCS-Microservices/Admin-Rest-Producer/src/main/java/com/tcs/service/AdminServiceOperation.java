/**
 * 
 */
package com.tcs.service;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.tcs.dao.AdminDAOInterFace;

/**
 * @author Aniket
 *
 */
@Component
public class AdminServiceOperation implements AdminInterFace {

	@Autowired
	private AdminDAOInterFace admin;
	
	
	@Override
	public List getAllCourses() throws SQLException {
		// TODO Auto-generated method stub
		return admin.allCourses();
	}

}
