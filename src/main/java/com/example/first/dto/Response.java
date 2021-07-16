package com.example.first.dto;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;



public class Response {

	private String name;
	public Response(String name, String email, String depName) {
		super();
		this.name = name;
		this.email = email;
		this.depName = depName;
	}
	private String email;
	private String depName;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDepName() {
		return depName;
	}
	public void setDepName(String depName) {
		this.depName = depName;
	}
	
}
