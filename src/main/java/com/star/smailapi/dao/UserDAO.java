package com.star.smailapi.dao;

import java.util.List;

import com.star.smailapi.entity.Users;

public interface UserDAO {
	
	public List<Users> findAll();
}
