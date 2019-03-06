package com.cassdb.controller;



import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cassdb.model.User;
import com.cassdb.repo.UserRepo;

@RestController
public class UserController {
	
	
	@Autowired
	private UserRepo repo;
	
	@PostConstruct
	public void saveUser() {
	List<User> users=new ArrayList<User>();
	users.add(new User(1,"vibhor","delhi",22));
	users.add(new User(2,"vibhor","delhi",22));
	users.add(new User(3,"vibhor","delhi",30));
	users.add(new User(4,"vibhor","delhi",34));
	users.add(new User(5,"vibhor","delhi",34));
	repo.saveAll(users);
	}
	
	@GetMapping("/getall")
	public List<User> getUsers(){
		return (List<User>) repo.findAll();
	}
	
	
	@GetMapping("/getage/{id}")
	public Optional<User> getId(Integer id){
		return repo.findById(id);
	}
	
}


