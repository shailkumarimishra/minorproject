package com.onlinelibrary.validation.impl;

import java.util.ArrayList;
import java.util.List;

import com.onlinelibrary.model.BookModel;
import com.onlinelibrary.validation.Validator;

public class ValidatorImpl implements Validator {

	@Override
	public List<String> validate(BookModel book) {
		List<String> errors=new ArrayList<>();
		if(book!=null) {
			if(book.getBookId()==null) {
				errors.add("bookId must not be null");
			}else if(book.getBookId().length()==10) {
				errors.add("bookId must be of length 10 characters");
			}
		}
		return errors;
	}

}
