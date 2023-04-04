package com.nagarro.springbootAssignment.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nagarro.springbootAssignment.model.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
	Book findByBookCode(long bookCode);

}
