package com.relation.relationship.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.relation.relationship.model.Address;
import com.relation.relationship.model.Student;
import com.relation.relationship.repository.AddressRepository;
import com.relation.relationship.repository.StudentRepository;
import com.relation.relationship.request.CreateStudentRequest;

public class StudentService {

	@Autowired
	StudentRepository studentRepository;
	
	@Autowired
	AddressRepository addressRepository;
	
	public Student createStudent (CreateStudentRequest createStudentRequest) {
		Student student = new Student(createStudentRequest);
		
		Address address = new Address();
		address.setStreet(createStudentRequest.getStreet());
		address.setCity(createStudentRequest.getCity());
		
		address = addressRepository.save(address);
		
		student.setAddress(address);
		student = studentRepository.save(student);
		return student;
	}
}
