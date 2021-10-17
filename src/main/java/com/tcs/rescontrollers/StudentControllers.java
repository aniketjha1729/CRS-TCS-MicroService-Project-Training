/**
 * 
 */
package com.tcs.rescontrollers;

import java.util.List;

import javax.validation.Valid;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tcs.bean.Student;
import com.tcs.service.StudentInterFace;


/**
 * @author Aniket
 *
 */
@RestController
@CrossOrigin
public class StudentControllers {
	
	@Autowired
	private StudentInterFace students;
	
	
	@GetMapping("/customers")
	public int getCustomers() {
	return 0;
	}
	
	@POST
	@Path("/studentRegistration")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response register(@Valid Student student)
	{
		
		try
		{
			students.addStudent(student.getStudentId(),student.getStudentName(),student.getStudentDept());
		}
		catch(Exception ex)
		{
			return Response.status(500).entity("Something went wrong! Please try again.").build(); 
		}
		
		
		return Response.status(201).entity("Registration Successful for "+student.getStudentId()).build(); 
	}
}
