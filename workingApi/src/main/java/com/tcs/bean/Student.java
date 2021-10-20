/**
 * 
 */
package com.tcs.bean;

/**
 * @author Aniket
 *
 */
public class Student{
	private int studentId;
	private String studentDept;
	private String studentName;
	
	
	public Student() {
		
	}


	public Student(int studentId, String studentDept, String studentName) {
		super();
		this.studentId = studentId;
		this.studentDept = studentDept;
		this.studentName = studentName;
	}


	/**
	 * @return the studentId
	 */
	public int getStudentId() {
		return studentId;
	}


	/**
	 * @param studentId the studentId to set
	 */
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}


	/**
	 * @return the studentDept
	 */
	public String getStudentDept() {
		return studentDept;
	}


	/**
	 * @param studentDept the studentDept to set
	 */
	public void setStudentDept(String studentDept) {
		this.studentDept = studentDept;
	}


	/**
	 * @return the studentName
	 */
	public String getStudentName() {
		return studentName;
	}


	/**
	 * @param studentName the studentName to set
	 */
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	
	
	
	
}
