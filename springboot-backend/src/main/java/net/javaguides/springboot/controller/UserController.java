package net.javaguides.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.javaguides.springboot.model.User;
import net.javaguides.springboot.repository.UserRepository;

@CrossOrigin(origins = "https://npwi7.csb.app")
@RestController
public class UserController {
	
	@Autowired
	private UserRepository userRepository;
	
	@PostMapping("/add")
	public ResponseEntity<?> addUsers(@RequestBody User user) {
		User us = this.userRepository.save(user);
		return ResponseEntity.ok(us);
	}
	
	@GetMapping("/users")
	public List<User> getUsers() {
//		System.out.println("Received");
		return this.userRepository.findAll();
	}
}
