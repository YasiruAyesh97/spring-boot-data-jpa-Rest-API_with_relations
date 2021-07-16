package com.example.first.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Deparment {
	@Id
	private Integer id;
	@Column(name="name")
	private String depName;
	
	@OneToMany(targetEntity  =Student.class,cascade =CascadeType.ALL)
	
	@JoinColumn(name="dep_fk",referencedColumnName = "id")
	private List<Student> students;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return depName;
	}
	public void setName(String name) {
		this.depName = name;
	}
	
}
