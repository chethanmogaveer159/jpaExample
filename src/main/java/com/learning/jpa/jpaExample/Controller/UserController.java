package com.learning.jpa.jpaExample.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.learning.jpa.jpaExample.Entity.User;
import com.learning.jpa.jpaExample.Service.UserService;

@RestController
public class UserController {
	@Autowired
	UserService userService;

	@GetMapping(value = "/users")
	public List<User> getAllUser() {
		return userService.getAllUser();
	}

	
	 @GetMapping(value="/users/{id}") 
	 public Optional<User> getUser(@PathVariable int id){ 
		 return userService.getUser(id); 
	 }
	 
	@PostMapping("/addUser")
	public void addEmployees(@RequestBody User user){
		userService.addUser(user);
	}
	
	@PutMapping("/users/{id}")
	public User updateUser(@RequestBody User user, @PathVariable int id){
		return userService.updateUser(user, id);
	}
	
	@DeleteMapping("/users/{id}")
	public void deleteUser(@PathVariable int id) {
		userService.deleteUser(id);
	}
}
