package com.example.first.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.first.dto.Response;
import com.example.first.model.Student;
import com.example.first.repository.StudentRepository;

@Service
public class StudentService {

	@Autowired
	StudentRepository studentRepository;
	
	public Iterable<Student> getAllStudent() {
		return studentRepository.findAll();
	}
	
	public Student addStudent(Student student) {
		return studentRepository.save(student);
	}
	
	public Student updateStudent(Student student) {
		return studentRepository.save(student);
	}
	
	public void deleteStudent(String id) {
		studentRepository.deleteById(id);
	}
	public Student getStudentByName(String name) {
		return studentRepository.getStudentByName(name);
	}
	@Transactional
	public void updateStudentEmail(String email,String id) {
		 studentRepository.updateStudentEmail(email,id);
	}
//	public List<Response> getStudentJoinData() {
//		return studentRepository.getJoinInformation();
//	}
}
