package com.nagarro.springbootAssignment.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nagarro.springbootAssignment.model.Author;

@Repository
public interface AuthorRepository extends JpaRepository<Author,Long>{

}
