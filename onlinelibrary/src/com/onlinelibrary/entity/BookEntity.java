package com.onlinelibrary.entity;

public class BookEntity {
	private String bookId;
	private String bookName;
	private String authorName;
	private String publication;
	private String edition;
	private double cost;

	public BookEntity() {
	}

	public BookEntity(String bookId, String bookName, String authorName, String publication, String edition,
			double cost) {
		this.bookId = bookId;
		this.bookName = bookName;
		this.authorName = authorName;
		this.publication = publication;
		this.edition = edition;
		this.cost = cost;
	}

	public String getBookId() {
		return bookId;
	}

	public void setBookId(String bookId) {
		this.bookId = bookId;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public String getPublication() {
		return publication;
	}

	public void setPublication(String publication) {
		this.publication = publication;
	}

	public String getEdition() {
		return edition;
	}

	public void setEdition(String edition) {
		this.edition = edition;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	@Override
	public String toString() {
		return "BookDetailsEntity [bookId=" + bookId + ", bookName=" + bookName + ", authorName=" + authorName
				+ ", publication=" + publication + ", edition=" + edition + ", cost=" + cost + "]";
	}

}
