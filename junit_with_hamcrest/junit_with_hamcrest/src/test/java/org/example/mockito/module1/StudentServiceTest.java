package org.example.mockito.module1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.*;

import java.util.ArrayList;
import java.util.List;
import java.util.*;

import com.training.ifaces.StudentRepository;
import com.training.model.Student;
import com.training.service.StudentService;


public class StudentServiceTest {

	@Mock
	StudentRepository repo1;
	
	@InjectMocks
	StudentService service;
	
	
//	@DisplayName(value ="Test Findallmethod With Mockito Stub")
//	@Test
//	
//		 void testFindAll()
//		 {
//			 
//			 StudentRepository repo = mock(StudentRepository.class);
//			 
//			 StudentService service = new StudentService(repo);
//			 
//			 //stubbing
//			 
//			 List<Student> list = Arrays.asList(new Student(101, "maniii"),new Student(102, "mohan"));
//			 when(repo.findAll()).thenReturn(list);
//			 
//			 assertEquals(service.findStudentSize(),2);
//			 
//		 }
	
	@DisplayName(value="Test addWithCondition Method of the Service it should add elements only if the "
			+ "roll number is greater than 2000 else it should return null value")
	
	@Test
	void testAddWithCondition() {
		
		
		Student Student = new Student(2020,"Ramesh");
		
		assertNotNull(service.addWithCondition(Student));
		
		verify(repo1,times(1));
	}
	
	@Test
	void verifyAddWithCondition() {
		
		Student stud = new Student(2020,"Ramesh");
		
	
		
		verify(service,times(1)).addWithCondition(stud);
	}
}
