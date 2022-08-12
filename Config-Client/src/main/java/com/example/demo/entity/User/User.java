package com.example.demo.entity.User;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Entity
@Table(name = "Gowse_User")
@AllArgsConstructor
@NoArgsConstructor

public class User {
	
	
	@Id
	@Column(name = "id")
	private int id;
	
	@Column (name = "name")
	private String name;
	
	@Column (name = "phone_number")
	private long phoneNumber;
	
	

}
