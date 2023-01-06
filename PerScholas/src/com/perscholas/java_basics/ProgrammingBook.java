package com.perscholas.java_basics;

class ProgrammingBook extends Book {

	private String publisher;
	
	public ProgrammingBook(String name, String datePublished, String author, double price, String category, String publisher) {
		super(name, datePublished, author, price, category);
		this.publisher = publisher;
	}
	
	
	
	public ProgrammingBook() {
		super();
		publisher ="";
	}



	public String getPublisher() {
		return publisher;
	}



	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	@Override
	public void printInfo() {
		super.printInfo();
		System.out.println("Publisher: " + this.getPublisher());
	}
}
