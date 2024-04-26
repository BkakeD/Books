package dmacc.beans;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Book {
	@Id
	@GeneratedValue
	private long id;
	private String name;
	private String author;
	private String isbn;
	private int pageCount;
	
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Book(String name, String author, String isbn, int pageCount) {
		super();
		this.name = name;
		this.author = author;
		this.isbn = isbn;
		this.pageCount = pageCount;
	}

	public Book(long id, String name, String author, String isbn, int pageCount) {
		super();
		this.id = id;
		this.name = name;
		this.author = author;
		this.isbn = isbn;
		this.pageCount = pageCount;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public int getPageCount() {
		return pageCount;
	}

	public void setPageCount(int pageCount) {
		this.pageCount = pageCount;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", author=" + author + ", isbn=" + isbn + ", pageCount="
				+ pageCount + "]";
	}
	
	
}
