package com.mark.miranda.exam.controller;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mark.miranda.exam.controller.response.GeneralResponse;
import com.mark.miranda.exam.entity.Book;
import com.mark.miranda.exam.entity.BookDto;
import com.mark.miranda.exam.service.BookService;

@RestController
@RequestMapping("/api")
public class BookController {

    private static final String EXCEPTION_MESSAGE = "Exception occured: ";

    private final BookService bookService;

    public BookController(BookService bookService) {

	this.bookService = Objects.requireNonNull(bookService);
    }

    @GetMapping("/books")
    public GeneralResponse getAllBooks() {

	GeneralResponse response;

	try {
	    List<BookDto> books = bookService.findAllBooks();

	    response = CollectionUtils.isEmpty(books) ? new GeneralResponse("No books available", null, 0)
		    : new GeneralResponse("List of books retrieved", books, books.size());
	} catch (Exception e) {
	    response = new GeneralResponse(EXCEPTION_MESSAGE + e.getMessage(), null, 0);
	}

	return response;
    }

    @GetMapping("/books/{bookId}")
    public GeneralResponse getBookById(@PathVariable("bookId") long bookId) {

	GeneralResponse response;

	Optional<Book> book = bookService.findBookById(bookId);

	response = book.isPresent() ? new GeneralResponse("Book found", book.get(), 1)
		: new GeneralResponse("Book not found", null, 0);

	return response;
    }

    @RequestMapping(value = "/books", method = { RequestMethod.POST, RequestMethod.PUT })
    public GeneralResponse addBook(@RequestBody BookDto bookDto) {

	GeneralResponse response;

	try {
	    bookService.saveOrUpdateBook(new Book(bookDto));
	    response = new GeneralResponse("Book added or updated", null, 0);
	} catch (Exception e) {
	    response = new GeneralResponse(EXCEPTION_MESSAGE + e.getMessage(), null, 0);
	}

	return response;
    }

    @DeleteMapping("/books/{bookId}")
    public GeneralResponse removeBook(@PathVariable long bookId) {

	GeneralResponse response;

	try {
	    Optional<Book> book = bookService.findBookById(bookId);

	    if (book.isPresent()) {
		bookService.deleteBook(book.get());
		response = new GeneralResponse("Book deleted", null, 0);
	    } else {
		response = new GeneralResponse("Book not found", null, 0);
	    }
	} catch (Exception e) {
	    response = new GeneralResponse(EXCEPTION_MESSAGE + e.getMessage(), null, 0);
	}

	return response;
    }

}
