/**
 * 
 */
package com.tcs.dao;

import com.tcs.bean.Student;
import com.tcs.exception.StudentNotRegisteredException;

/**
 * @author Aniket
 *
 */
public interface StudentDAOInterFace {
	public boolean addStudent(Student student) throws StudentNotRegisteredException;
}
