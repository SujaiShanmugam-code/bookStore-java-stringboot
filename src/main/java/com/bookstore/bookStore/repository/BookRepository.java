package com.bookstore.bookStore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bookstore.bookStore.model.Book;

@Repository
public interface BookRepository extends JpaRepository<Book,Integer>  {

}