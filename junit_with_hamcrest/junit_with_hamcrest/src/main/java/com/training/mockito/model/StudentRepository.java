package com.training.mockito.model;

import java.util.List;

import com.training.model.Student;

public interface StudentRepository {
	
	public Student add(Student entity);
	public List<Student> getById();
	
	
}
