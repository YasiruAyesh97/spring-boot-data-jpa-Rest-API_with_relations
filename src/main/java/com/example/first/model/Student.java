package com.example.first.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Entity
public class Student {
	
	@Id
	private String id;
	@Column(name="fullname")
	private String name;
	private String email;
	private Integer dep_fk;
	
	public Integer getDep_fk() {
		return dep_fk;
	}
	public void setDep_fk(Integer dep_fk) {
		this.dep_fk = dep_fk;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
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
	
}
