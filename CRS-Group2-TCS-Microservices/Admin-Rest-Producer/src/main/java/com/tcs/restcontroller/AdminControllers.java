/**
 * 
 */
package com.tcs.restcontroller;

import javax.ws.rs.QueryParam;
import java.sql.SQLException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.tcs.service.AdminInterFace;

import org.springframework.http.HttpStatus;
import javax.ws.rs.core.Response;
/**
 * @author Aniket
 *
 */
@RestController
@CrossOrigin
public class AdminControllers {
	
	@Autowired
	private AdminInterFace admin;

	/**
	 * Admin viewing all Courses using SQL commands
	 * 
	 * @throws SQLException
	 */
	@RequestMapping(method = RequestMethod.GET, value = "/admin/courses")
	public List getCourses() throws SQLException {
		return admin.getAllCourses();
	}

	
}
