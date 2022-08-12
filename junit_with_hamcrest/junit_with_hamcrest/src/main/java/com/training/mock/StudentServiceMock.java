package com.training.mock;



import static org.junit.Assert.assertEquals;

import java.util.List;

import com.training.ifaces.StudentRepository;
import com.training.model.Student;

public class StudentServiceMock implements StudentRepository {

	int addCount=0;
	Student lastAdded =null;
	
	@Override
	public Student add(Student entity) {
		
		addCount++;
		lastAdded=entity;
		return lastAdded;
	}

	@Override
	public List<Student> findAll() {
		return null;
	}
	
	public void verify(Student entity,int count) { 
		
		assertEquals(addCount,count );

		assertEquals(lastAdded,entity );
	}

}
