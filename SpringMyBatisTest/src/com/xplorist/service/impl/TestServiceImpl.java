package com.xplorist.service.impl;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.xplorist.entity.User;
import com.xplorist.mapper.TestMapper;
import com.xplorist.model.Result;
import com.xplorist.repository.UserRepository;
import com.xplorist.service.TestService;

@Service
public class TestServiceImpl implements TestService {
	@Autowired
	private TestMapper mapper;
	@Autowired
	private UserRepository userRepository;

	@Override
	public List<Result> queryResultList() {
		return mapper.queryResultList();
	}

	@Override
	@Transactional
	public List<User> listUser() {
		User user = new User();
		user.setId(UUID.randomUUID().toString().toUpperCase());
		user.setUsername("aaa");
		user.setPassword("yyy");
		
		mapper.addUser(user);
		
		User userB = new User();
		userB.setId(UUID.randomUUID().toString().toUpperCase());
		userB.setUsername("bbb");
		userB.setPassword("yyy");
		userRepository.saveAndFlush(userB);
		
		return mapper.listAllUser();
	}

	@Override
	@Transactional
	public User save(User user) {
		user.setId(UUID.randomUUID().toString().toUpperCase());
		
		user = userRepository.saveAndFlush(user);
		
		return user;
	}
	
}
