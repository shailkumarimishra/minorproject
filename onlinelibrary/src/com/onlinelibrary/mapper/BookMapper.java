package com.onlinelibrary.mapper;

import java.util.List;

import com.onlinelibrary.entity.BookEntity;
import com.onlinelibrary.model.BookModel;

public abstract class BookMapper {
	public abstract BookModel mapToModel(BookEntity entity);

	public abstract BookEntity mapToEntity(BookModel model);

	public abstract List<BookModel> mapToBook(List<BookEntity> entity);

	public abstract List<BookEntity> mapToBookEntity(List<BookModel> model);
}
