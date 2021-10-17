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
	public void addStudent(Long studentId, String studentName, String studentDept)
			throws StudentNotRegisteredException {
		// TODO Auto-generated method stub
		
		try
		{
			//call the DAO class, and add the student record to the DB
			Student newStudent=new Student(studentId,studentName,studentDept);
			students.addStudent(newStudent);
			
		}
		catch(StudentNotRegisteredException ex)
		{
			throw ex;
		}
		
	}

}
