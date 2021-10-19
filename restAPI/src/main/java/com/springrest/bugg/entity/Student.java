/**
 * 
 */
package com.springrest.bugg.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @author Aniket
 *
 */
@Entity
public class Student {
		@Id
		private long studentId;
		private String studentName;
		private String studentBatch;
		public Student() {
			super();
			// TODO Auto-generated constructor stub
		}
		/**
		 * @return the studentId
		 */
		public long getStudentId() {
			return studentId;
		}
		/**
		 * @param studentId the studentId to set
		 */
		public void setStudentId(long studentId) {
			this.studentId = studentId;
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
		/**
		 * @return the studentBatch
		 */
		public String getStudentBatch() {
			return studentBatch;
		}
		/**
		 * @param studentBatch the studentBatch to set
		 */
		public void setStudentBatch(String studentBatch) {
			this.studentBatch = studentBatch;
		}
		@Override
		public String toString() {
			return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentBatch=" + studentBatch
					+ "]";
		}
		
}
