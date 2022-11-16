package com.book.exception;

public class InvalidBookException extends Exception{
	String msg;

	public InvalidBookException(String msg) {
		// passing the parameter to super class constructor
		super(msg);
		this.msg = msg;
	
	}
	// overriding with our custom message
	/*@Override
    public String toString(){
        return msg;
    }*/
	


}
