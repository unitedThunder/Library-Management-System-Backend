package com.mzos.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mzos.model.Book;
import com.mzos.service.IBookService;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/v1/")
public class BooksController {

	@Autowired
	IBookService service;
	
	@PostMapping("/book")
	public Book addBook(@RequestBody Book book) {
		return service.insertBook(book);
	}
	
	@GetMapping("/books")
	public List<Book> getAllBooks(){
		return service.getAllBooks();
	}
	
	@GetMapping("/book/{isbn}")
	public ResponseEntity<Book> getByIsbn(@PathVariable long isbn) {
		return service.getBookById(isbn);
	}
	
	@PutMapping("/book/{isbn}")
	public ResponseEntity<Book> editEmployee(@PathVariable long isbn, @RequestBody Book bookOb) {
		return service.getBookById(isbn,bookOb);
	}
	
	@DeleteMapping("/book/{isbn}")
	public ResponseEntity<Map<String, Boolean>> deleteEmployee(@PathVariable long isbn){
		return service.deleteById(isbn);
	}
}
