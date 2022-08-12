package com.example.demo.ifaces;



import java.util.List;

//import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Component;

import com.example.demo.entity.Book;

@Component
public interface Bookrepo extends JpaRepository<Book, Integer> {

	public List<Book> deleteById(int id);
	
	
	@Query(nativeQuery=true,
			value="select book_Id,book_Name from gowshick_book_service  where book_Id=:id")
	public List<Book> getDataById (@Param("id") int id);
	
	
//	@Query(nativeQuery=true,
//			value="select book_Id,book_Name from gowshick_book_service  where book_Id=:id")
//	public List<Book> getDataById (@Param("id") int id);
	
	
	
}
