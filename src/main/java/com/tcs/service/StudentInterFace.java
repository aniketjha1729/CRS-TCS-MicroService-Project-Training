/**
 * 
 */
package com.tcs.service;

import com.tcs.exception.StudentNotRegisteredException;

/**
 * @author Aniket
 *
 */
public interface StudentInterFace {
	public void addStudent(Long studentId,String studentName,String studentDept) throws StudentNotRegisteredException; 
	
}
