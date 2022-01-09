package com.learning.jpa.jpaExample.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.learning.jpa.jpaExample.Entity.User;
import com.learning.jpa.jpaExample.Repository.UserRepository;


@Service
public class UserService {
	@Autowired
	UserRepository userRepository;
	public  List<User> getAllUser(){
		List<User> users=new ArrayList<>();
		users=userRepository.findAll();
		return users;
	}
	
	public User addUser(User user) {
		user=userRepository.save(user);
		return user;
	}
	
	public Optional<User> getUser(int id){
		return userRepository.findById(id);
	}
	
	public User updateUser(User user, int id){
		if(id == user.getId()) {
			return userRepository.save(user);
		}
		return user;
	}
	
	public void deleteUser(int id) {
		userRepository.deleteById(id);
	}
}
