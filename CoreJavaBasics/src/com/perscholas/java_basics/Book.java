package com.perscholas.java_basics;

public class Book {

	//-----------------Instance Fields--------------------	
	private String name;
	private String datePublished;
	private String author;
	private double price;
	private String category;

	//-------------------Constructors--------------------
	//default
	public Book() {
		this.name = "";
		this.datePublished ="";
		this.author="";
		this.price =0.00;
		this.category ="";
	}

	//parameterized
	public Book(String name, String datePublished, String author, double price, String category) {
		this.name = name;
		this.datePublished = datePublished;
		this.author = author;
		this.price = price;
		this.category = category;
	}

	//----------Getters & Setters----------------------------
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDatePublished() {
		return datePublished;
	}

	public void setDatePublished(String datePublished) {
		this.datePublished = datePublished;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	//--------------------------Methods------------------

	public void printInfo() {
		System.out.println(
						"Name: "+ this.getName() +"\n"+
						"Date Published: "+ this.getDatePublished() +"\n"+
						"Author: "+ this.getAuthor() +"\n"+
						"Price: "+ this.getPrice() +"\n"+
						"Category: "+ this.getCategory() 
				);
	}


}
