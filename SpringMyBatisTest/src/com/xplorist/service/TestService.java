package com.xplorist.service;

import java.util.List;

import com.xplorist.entity.User;
import com.xplorist.model.Result;

public interface TestService {
	List<Result> queryResultList();
	
	List<User> listUser();
	
	User save(User user); 
}
