package com.shruteekaTech.PhoneBookApp.Exception;

import java.util.Date;

public class ApiResponse {
	
	private Integer responseCode;
	
	private String description;
	
	private Date date;
	
	
	public ApiResponse(Integer responseCode, String description, Date date) {
		super();
		this.responseCode = responseCode;
		this.description = description;
		this.date = date;
	}

	public Integer getResponseCode() {
		return responseCode;
	}

	public void setResponseCode(Integer responseCode) {
		this.responseCode = responseCode;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}


	
	

}
