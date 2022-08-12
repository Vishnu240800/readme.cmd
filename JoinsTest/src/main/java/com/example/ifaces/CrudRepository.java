package com.example.ifaces;

import java.util.*;

public interface CrudRepository <T> {
	
	public int add(T obj);
	public List <T> findAll();
	public int remove(int id);
	public Optional<T> findById(int id);
	public int update (int Id,T obj);

}
