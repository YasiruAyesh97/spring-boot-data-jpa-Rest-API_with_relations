package com.relation.relationship.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.relation.relationship.repository.AddressRepository;
import com.relation.relationship.repository.StudentRepository;

public class StudentService {

	@Autowired
	StudentRepository studentRepository;
	
	@Autowired
	AddressRepository addressRepository;
	
}
