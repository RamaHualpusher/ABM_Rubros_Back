package com.abm.rubros.test.demo.exeption;

public class ResourceNotFoundException extends RuntimeException{
    public ResourceNotFoundException(String message) {
        super(message);
    }
    public ResourceNotFoundException(String message, String campo, Long id) {
    	        super(message + " " + campo + " " + id);
    }

}
