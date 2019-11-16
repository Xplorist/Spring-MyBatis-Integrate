package com.xplorist.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.xplorist.model.Result;

@Repository
public interface TestMapper {
	List<Result> queryResultList();
}
