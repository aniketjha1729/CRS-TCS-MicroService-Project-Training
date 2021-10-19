/**
 * 
 */
package com.springrest.bugg.services;

import java.util.List;

import com.springrest.bugg.entity.Student;



/**
 * @author Aniket
 *
 */
public interface StudentService {
	public List<Student> getAllStudents();
	public Student getStudent(long studentId);
	public Student addStudent(Student student);
}
