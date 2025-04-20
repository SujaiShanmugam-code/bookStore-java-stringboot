package com.bookstore.bookStore.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bookstore.bookStore.model.MyBookList;

@Repository
public interface MybooksRepository extends JpaRepository <MyBookList , Integer>
{
}
