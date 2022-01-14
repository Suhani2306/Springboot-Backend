package net.javaguides.springboot.model;

import org.springframework.data.mongodb.core.mapping.Document;

//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.Table;

//@Entity
@Document("UsersCollection")
public class User {
	
//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String id;
	
//	@Column(name = "name")
	private String name;
	
//	@Column(name = "username")
	private String username;
	
	private String email;
	
//	public User() {
//		
//	}
	
	public User(String name, String username, String email) {
		super();
		this.name = name;
		this.username = username;
		this.email = email;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String Name) {
		this.name = Name;
	}
	public String getUserName() {
		return username;
	}
	public void setUserName(String userName) {
		this.username = userName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
}

