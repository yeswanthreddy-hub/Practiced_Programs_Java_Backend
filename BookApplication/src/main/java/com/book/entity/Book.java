package com.book.entity;

import jakarta.persistence.*;

@Entity
public class Book {
	@Id
	int id;
	String name;
	String writer;
	double price;
	
	public Book(int id, String name, String writer, double price) {
		this.id = id;
		this.name = name;
		this.writer = writer;
		this.price = price;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
}
