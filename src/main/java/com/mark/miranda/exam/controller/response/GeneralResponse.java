package com.mark.miranda.exam.controller.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class GeneralResponse {

    private String message;

    private Object result;

    private int total;

    public GeneralResponse(String message, Object result, int total) {

	this.message = message;
	this.result = result;
	this.total = total;
    }

    public String getMessage() {

	return message;
    }

    public void setMessage(String message) {

	this.message = message;
    }

    public Object getResult() {

	return result;
    }

    public void setResult(Object result) {

	this.result = result;
    }

    public int getTotal() {

	return total;
    }

    public void setTotal(int total) {

	this.total = total;
    }

}
