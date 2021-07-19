package com.relation.relationship.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.relation.relationship.model.Address;
import com.relation.relationship.model.Student;
import com.relation.relationship.model.Subject;
import com.relation.relationship.repository.AddressRepository;
import com.relation.relationship.repository.StudentRepository;
import com.relation.relationship.repository.SubjectRepository;
import com.relation.relationship.request.CreateStudentRequest;
import com.relation.relationship.request.CreateSubjectRequest;

@Service
public class StudentService {

	@Autowired
	StudentRepository studentRepository;
	
	@Autowired
	AddressRepository addressRepository;
	
	@Autowired
	SubjectRepository subjectRepository;
	
	
	public Student createStudent(CreateStudentRequest createStudentRequest) {
		Student student = new Student(createStudentRequest);
		
		Address address = new Address();
		address.setStreet(createStudentRequest.getStreet());
		address.setCity(createStudentRequest.getCity());
		
		address = addressRepository.save(address);
		
		student.setAddress(address);
		student = studentRepository.save(student);
		
		List<Subject> subjectList =new ArrayList<Subject>();
		if(createStudentRequest.getSubjectsLearning() !=null) {
			for(CreateSubjectRequest createSubjectRequest : createStudentRequest.getSubjectsLearning()) {
				Subject subject=new Subject();
				subject.setSubjectName(createSubjectRequest.getSubjectName());
				subject.setMarksObtained(createSubjectRequest.getMarksObtained());
				subject.setStudent(student);
				subjectList.add(subject);
				
			}
			subjectRepository.saveAll(subjectList);
		}
		student.setLearningSubject(subjectList);
		return student;
	}
	public List<Student> getByCity (String city) {
		return studentRepository.getByAddressCity(city);
	}
	public Iterable<Student> getAllStudents () {
		return studentRepository.findAll();
	}
	
}
