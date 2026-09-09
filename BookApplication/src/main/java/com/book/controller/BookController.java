package com.book.controller;

import java.util.*;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.book.entity.Book;

@RestController
public class BookController {
	ArrayList<Book> books=new ArrayList<>();
	@GetMapping("/book")
	public ArrayList<Book> getBook() {
		return books;
	}
	@PostMapping("/pusthakam")
	public String addBook(@RequestBody Book book) {
		books.add(book);
		return "book added Successfully";
	}
	@PutMapping("/updateBook")
	public String updateBook(@RequestBody Book book) {
		for(Book b:books) {
			if(b.getId()==book.getId()) {
				b.setName(book.getName());
				b.setWriter(book.getWriter());
				b.setPrice(book.getPrice());
			}
		}
		return "book not Founded";
	}
	@DeleteMapping("/dBook/{id}")
	public String deleteBook(@PathVariable int id) {
		for(Book b:books) {
			if(id==b.getId()) {
				books.remove(b);
				return "Book removed Successfully";
			}
		}
		return "Book Not removed";
	}
}
