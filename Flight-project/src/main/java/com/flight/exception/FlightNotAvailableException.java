package com.flight.exception;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;


@ResponseStatus(value=HttpStatus.NOT_FOUND)
public class FlightNotAvailableException extends RuntimeException{
	
	    private static final long serialVersionUID = 1L;
	    private String resourceName;
	    private String feildName;
	    private Object feildValue;
	    
	    public FlightNotAvailableException(String resourceName, String feildName, Object feildValue) {
	        super();
	        this.resourceName = resourceName;
	        this.feildName = feildName;
	        this.feildValue = feildValue;
	    }
	    public String getResourceName() {
	        return resourceName;
	    }
	    public String getFeildName() {
	        return feildName;
	    }
	    public Object getFeildValue() {
	        return feildValue;
	    }
	    
	    



}


