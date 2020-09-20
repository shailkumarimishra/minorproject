package com.onlinelibrary.mapper.impl;

import java.util.ArrayList;
import java.util.List;

import com.onlinelibrary.entity.BookEntity;
import com.onlinelibrary.mapper.BookMapper;
import com.onlinelibrary.model.BookModel;

public class BookMapperImpl extends BookMapper {

	@Override
	public List<BookModel> mapToBook(List<BookEntity> entity) {
		List<BookModel> li=new ArrayList<>();
		for(BookEntity book:entity) {
			BookModel books=new BookModel();
			books.setBookId(book.getBookId());
			books.setBookName(book.getBookName());
			books.setAuthorName(book.getAuthorName());;
			books.setPublication(book.getPublication());
			books.setEdition(book.getEdition());
			books.setCost(book.getCost());
			li.add(books);
		}
		return li;

	}

	@Override
	public List<BookEntity> mapToBookEntity(List<BookModel> model) {
		List<BookEntity> li=new ArrayList<>();
		for(BookModel book:model) {
			BookEntity books=new BookEntity();
			books.setBookId(book.getBookId());
			books.setBookName(book.getBookName());
			books.setAuthorName(book.getAuthorName());;
			books.setPublication(book.getPublication());
			books.setEdition(book.getEdition());
			books.setCost(book.getCost());
			li.add(books);
		}
		return li;
	}

	@Override
	public BookModel mapToModel(BookEntity entity) {
		BookModel book=new BookModel();
		book.setBookId(entity.getBookId());
		book.setBookName(entity.getBookName());
		book.setAuthorName(entity.getAuthorName());
		book.setPublication(entity.getPublication());
		book.setEdition(entity.getEdition());
		book.setCost(entity.getCost());
		return book;
	}

	@Override
	public BookEntity mapToEntity(BookModel model) {
		BookEntity book=new BookEntity();
		book.setBookId(model.getBookId());
		book.setBookName(model.getBookName());
		book.setAuthorName(model.getAuthorName());
		book.setPublication(model.getPublication());
		book.setEdition(model.getEdition());
		book.setCost(model.getCost());
		return book;
	}

}
