package com.mzos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mzos.model.Book;

@Repository
public interface BooksRepo extends JpaRepository<Book, Long>{

}
