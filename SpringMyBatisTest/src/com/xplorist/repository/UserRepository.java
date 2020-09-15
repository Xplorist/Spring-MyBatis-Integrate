package com.xplorist.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.xplorist.entity.User;

public interface UserRepository extends JpaRepository<User, Serializable>{
	
}
