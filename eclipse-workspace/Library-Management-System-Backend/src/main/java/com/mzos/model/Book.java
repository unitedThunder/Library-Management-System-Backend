package com.mzos.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Books")
public class Book {

	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ISBN")
	private long isbn;
	
	@Column(name="Book_Name")
	private String bookName;
	
	@Column(name = "Serial_Number")
	private String serialNumber;
	
	@Column(name = "Description")
	private String description;
	
	public long getIsbn() {
		return isbn;
	}
	public void setIsbn(long isbn) {
		this.isbn = isbn;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getSerialNumber() {
		return serialNumber;
	}
	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Book(long isbn, String bookName, String serialNumber, String description) {
		super();
		this.isbn = isbn;
		this.bookName = bookName;
		this.serialNumber = serialNumber;
		this.description = description;
	}
	@Override
	public String toString() {
		return "Book [isbn=" + isbn + ", bookName=" + bookName + ", serialNumber=" + serialNumber + ", description="
				+ description + "]";
	}
	
}
