package com.excellence.springbootcrudapisecurity.models;

import java.io.Serializable;

import org.hibernate.annotations.DynamicUpdate;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "users")
@DynamicUpdate
public class User implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@NotEmpty(message="Name can't be null")
	private String username;
	@NotEmpty(message="email can't be null")
	private String email;
	@NotEmpty(message="password can't be null")
	private String password;
	@NotEmpty(message="role can't be null")
	private String role; // user, admin
	
	
//
//	public User(String username, String email, String password, String role) {
//		this.username = username;
//		this.email = email;
//		this.password = password;
//		this.role = role;
//	}
//	
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + username + "role="  + role +" ,email=" + email + ", password=" + password + "]";
	}

}
