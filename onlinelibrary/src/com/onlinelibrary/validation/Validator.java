package com.onlinelibrary.validation;

import java.util.List;

import com.onlinelibrary.model.BookModel;

public interface Validator {
	public abstract List<String> validate(BookModel book);
}
