package com.example.demo.services.exceptions;

public class ResourcedNotFoundException extends RuntimeException{

	private static final long serialVersionUID = 1L;

	public ResourcedNotFoundException(Object id) {
		super("Resource not found. Id " + id);
	}
	
}
