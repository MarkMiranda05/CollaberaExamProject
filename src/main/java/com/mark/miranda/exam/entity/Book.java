package com.mark.miranda.exam.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String bookName;

    private String bookAuthor;

    private String bookGenre;

    private String bookYear;

    public Book() {

    }

    public Book(BookDto bookDto) {

	this.id = bookDto.getBookId();
	this.bookName = bookDto.getBookName();
	this.bookAuthor = bookDto.getBookAuthor();
	this.bookGenre = bookDto.getBookGenre();
	this.bookYear = bookDto.getBookYear();
    }

    public long getId() {

	return id;
    }

    public void setId(long id) {

	this.id = id;
    }

    public String getBookName() {

	return bookName;
    }

    public void setBookName(String bookName) {

	this.bookName = bookName;
    }

    public String getBookAuthor() {

	return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {

	this.bookAuthor = bookAuthor;
    }

    public String getBookGenre() {

	return bookGenre;
    }

    public void setBookGenre(String bookGenre) {

	this.bookGenre = bookGenre;
    }

    public String getBookYear() {

	return bookYear;
    }

    public void setBookYear(String bookYear) {

	this.bookYear = bookYear;
    }

}
