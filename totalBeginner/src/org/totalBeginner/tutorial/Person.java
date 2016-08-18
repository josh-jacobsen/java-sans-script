package org.totalBeginner.tutorial;

public class Person {
	// fields
	private String name; // the persons name 
	private int maximumBooks; // the max number of books this person can borrow
	
	// constructors
	public Person() {
		name = "unknown name";
		maximumBooks = 3;
	}
	
	// methods
	public String getName() {
		return name;
	}
	public void setName(String anyName) {
		name = anyName;
	}

	public int getMaximumBooks() {
		return maximumBooks;
	}

	public void setMaximumBooks(int maximumBooks) {
		this.maximumBooks = maximumBooks;
	}
	

}
