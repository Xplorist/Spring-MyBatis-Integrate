package com.xplorist.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.xplorist.model.Result;
import com.xplorist.service.TestService;

@RestController
@RequestMapping("/api/test")
public class TestController {
	@Autowired
	private TestService svc;
	
	@RequestMapping("/test.x")
	public List<Result> test() {
		return svc.queryResultList();			
	}
}
