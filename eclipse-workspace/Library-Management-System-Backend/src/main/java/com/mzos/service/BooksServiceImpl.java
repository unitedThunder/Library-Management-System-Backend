package com.mzos.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.mzos.exception.ResourceNotFoundException;
import com.mzos.model.Book;
import com.mzos.repository.BooksRepo;

@Service
public class BooksServiceImpl implements IBookService {

	@Autowired
	BooksRepo repo;
	
	@Override
	public Book insertBook(Book book) {
		return repo.save(book);
	}
	
	@Override
	public List<Book> getAllBooks() {
		
		return repo.findAll();
	}

	@Override
	public ResponseEntity<Book> getBookById(long isbn) {
		Book book = repo.findById(isbn).orElseThrow(()-> new ResourceNotFoundException("Book not found with ISBN : "+isbn));
		return ResponseEntity.ok(book);
	}

	@Override
	public ResponseEntity<Book> getBookById(long isbn, Book bookOb) {
		
		Book book = repo.findById(isbn).orElseThrow(()-> new ResourceNotFoundException("Book not found with ISBN : "+isbn));
		book.setIsbn(bookOb.getIsbn());
		book.setBookName(bookOb.getBookName());
		book.setSerialNumber(bookOb.getSerialNumber());
		book.setDescription(bookOb.getDescription());
		
		Book updatedBook=repo.save(book);
		
		return ResponseEntity.ok(updatedBook);
	}

	@Override
	public ResponseEntity<Map<String, Boolean>> deleteById(long isbn) {
		
		Book book = repo.findById(isbn).orElseThrow(()-> new ResourceNotFoundException("Book not found with ISBN : "+isbn));
		repo.delete(book);
		Map<String, Boolean> response= new HashMap<String, Boolean>();
		response.put("Deleted", Boolean.TRUE);
		return ResponseEntity.ok(response);
	}

}
