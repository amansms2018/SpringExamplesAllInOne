package com.mkyong.error;

public class BookNotFoundException extends RuntimeException {

    public BookNotFoundException(Long id) {
        super("Book  with id :  " + id + " is not  found!!!!!");
    }

}
