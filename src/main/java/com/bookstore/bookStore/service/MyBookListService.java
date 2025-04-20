package com.bookstore.bookStore.service;

import java.util.List;

import com.bookstore.bookStore.model.MyBookList;
import com.bookstore.bookStore.repository.MybooksRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class MyBookListService {

    @Autowired
    private MybooksRepository mybook;

    public void saveMyBooks(MyBookList book) {
        mybook.save(book);
    }

    public List<MyBookList> getAllMyBooks(){
        return mybook.findAll();
    }

    public void deleteById(int id) {
        mybook.deleteById(id);
    }
}