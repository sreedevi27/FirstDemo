package com.firstdemo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;


public interface StudentRepo extends CrudRepository<Student, String> {
 
	public List<Student> findByState(String name);

}
