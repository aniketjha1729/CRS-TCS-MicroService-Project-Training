/**
 * 
 */
package com.springrest.bugg.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springrest.bugg.dao.StudentsDAO;
import com.springrest.bugg.entity.Student;

/**
 * @author Aniket
 *
 */
@Service
public class StudentImp implements StudentService {
	
	@Autowired
	private StudentsDAO studentdao;

	@Override
	public List<Student> getAllStudents() {
		// TODO Auto-generated method stub
		return studentdao.findAll();
	}

	@Override
	public Student getStudent(long studentId) {
		// TODO Auto-generated method stub
		return studentdao.getOne(studentId);
	}

	@Override
	public Student addStudent(Student student) {
		// TODO Auto-generated method stub
		studentdao.save(student);
		return student;
	}

	

}
