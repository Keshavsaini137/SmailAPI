package com.star.smailapi.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.star.smailapi.dao.UserDAO;
import com.star.smailapi.entity.Users;

@RestController
@RequestMapping("/api")
public class UserController {
	
	private UserDAO userDao; 
	
	public UserController(UserDAO userDao) {
		this.userDao = userDao;
	}

	@RequestMapping("/hello")
	public String hello() {
		return "hello";
	}
	
	@GetMapping("/hibusers")
	public List<Users> findAll(){		
		return userDao.findAll();
	}
	
}
