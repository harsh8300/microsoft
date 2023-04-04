package com.nagarro.springbootAssignment.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nagarro.springbootAssignment.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
	
	public User findByName(String username);
	public User findByNameAndPassword(String username, String password);


}
