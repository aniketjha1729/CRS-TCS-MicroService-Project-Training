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
public class Course {
	@Id
	private long id;
	private String title;
	private String descr;
	@Override
	public String toString() {
		return "Course [id=" + id + ", title=" + title + ", descr=" + descr + "]";
	}
	
	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Course(long id, String title, String descr) {
		super();
		this.id = id;
		this.title = title;
		this.descr = descr;
	}

	
	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}
	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}
	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	/**
	 * @return the descr
	 */
	public String getDescr() {
		return descr;
	}
	/**
	 * @param descr the descr to set
	 */
	public void setDescr(String descr) {
		this.descr = descr;
	}
	
	
}
