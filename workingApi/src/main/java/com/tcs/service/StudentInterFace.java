/**
 * 
 */
package com.tcs.service;

import com.tcs.bean.Student;
import com.tcs.exception.StudentNotRegisteredException;

/**
 * @author Aniket
 *
 */
public interface StudentInterFace {
	public void addStudent(Student student) throws StudentNotRegisteredException; 
	
}
