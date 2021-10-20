/**
 * 
 */
package com.springrest.bugg.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springrest.bugg.entity.Student;

/**
 * @author Aniket
 *
 */
public interface StudentsDAO extends JpaRepository<Student, Long> {

}
