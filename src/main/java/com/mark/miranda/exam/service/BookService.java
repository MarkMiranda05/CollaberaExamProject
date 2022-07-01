package com.mark.miranda.exam.service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.mark.miranda.exam.entity.Book;
import com.mark.miranda.exam.entity.BookDto;
import com.mark.miranda.exam.repository.BookRepository;

@Service
public class BookService {

    private final BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {

	this.bookRepository = Objects.requireNonNull(bookRepository);
    }

    public List<BookDto> findAllBooks() {

	return bookRepository.findAll().stream().map(BookDto::new).collect(Collectors.toList());
    }

    public Optional<Book> findBookById(long bookId) {

	return bookRepository.findById(bookId);
    }

    public void saveOrUpdateBook(Book course) {

	bookRepository.save(course);
    }

    public void deleteBook(Book book) {

	bookRepository.delete(book);
    }

}
