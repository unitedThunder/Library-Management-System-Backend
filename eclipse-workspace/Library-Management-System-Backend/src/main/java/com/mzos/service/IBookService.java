package com.mzos.service;

import java.util.List;
import java.util.Map;

import org.springframework.http.ResponseEntity;

import com.mzos.model.Book;

public interface IBookService {

	Book insertBook(Book book);

	List<Book> getAllBooks();

	ResponseEntity<Book> getBookById(long isbn);

	ResponseEntity<Book> getBookById(long isbn, Book bookOb);

	ResponseEntity<Map<String, Boolean>> deleteById(long isbn);

}