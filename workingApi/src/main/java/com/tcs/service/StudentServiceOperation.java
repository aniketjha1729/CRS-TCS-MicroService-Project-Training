/**
 * 
 */
package com.tcs.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.tcs.bean.Student;
import com.tcs.dao.StudentDAOInterFace;
import com.tcs.exception.StudentNotRegisteredException;

/**
 * @author Aniket
 *
 */
@Component
public class StudentServiceOperation implements StudentInterFace {

	@Autowired
	private StudentDAOInterFace students;
	
	@Override
	public void addStudent(Student student)
			throws StudentNotRegisteredException {
		// TODO Auto-generated method stub
		
		try
		{
			//call the DAO class, and add the student record to the DB
			
			students.addStudent(student);
			
		}
		catch(StudentNotRegisteredException ex)
		{
			throw ex;
		}
		
	}

}
