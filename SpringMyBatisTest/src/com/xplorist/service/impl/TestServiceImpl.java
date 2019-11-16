package com.xplorist.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xplorist.mapper.TestMapper;
import com.xplorist.model.Result;
import com.xplorist.service.TestService;

@Service
public class TestServiceImpl implements TestService {
	@Autowired
	private TestMapper mapper;

	@Override
	public List<Result> queryResultList() {
		return mapper.queryResultList();
	}
	
}
