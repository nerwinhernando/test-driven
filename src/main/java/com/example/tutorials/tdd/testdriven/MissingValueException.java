package com.example.tutorials.tdd.testdriven;

public class MissingValueException extends RuntimeException {
	// this is all we need now
	public MissingValueException(String message) {
		super(message);
	}
}
