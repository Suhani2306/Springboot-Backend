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
	private String userName;
	
	private String email;
	
	public User() {
		
	}
	
	public User(String name, String username, String email) {
		super();
		this.name = name;
		this.userName = username;
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
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
}

