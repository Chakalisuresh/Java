package com.cg.Student.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.Student.Entity.Student;


@Repository

public interface StudentReposutory extends JpaRepository<Student,Integer> {
	
	

}
