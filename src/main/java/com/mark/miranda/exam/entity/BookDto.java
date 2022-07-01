package com.mark.miranda.exam.entity;

public class BookDto {

    private long bookId;

    private String bookName;

    private String bookAuthor;

    private String bookGenre;

    private String bookYear;

    public BookDto() {

    }

    public BookDto(Book book) {

	this.bookId = book.getId();
	this.bookName = book.getBookName();
	this.bookAuthor = book.getBookAuthor();
	this.bookGenre = book.getBookGenre();
	this.bookYear = book.getBookYear();
    }

    public long getBookId() {

	return bookId;
    }

    public void setBookId(long bookId) {

	this.bookId = bookId;
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
