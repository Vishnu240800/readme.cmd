package com.example.demo.repos.AddressRepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.User.User;

public interface AddressRepository extends JpaRepository<User, Integer> {
	
	

}
