package com.example.demo;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class StudentResponse {
	
	private long id;
	@JsonIgnore
	private String first;
	private String last;
	public StudentResponse(long id,String first,String last) {
		this.setId(id);
		this.setFirst(first);
		this.setLast(last);
		
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getFirst() {
		return first;
	}
	public void setFirst(String first) {
		this.first = first;
	}
	public String getLast() {
		return last;
	}
	public void setLast(String last) {
		this.last = last;
	}
	
}
