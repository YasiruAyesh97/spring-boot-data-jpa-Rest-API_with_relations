package com.example.first.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.example.first.dto.Response;
import com.example.first.model.Student;

public interface StudentRepository extends CrudRepository<Student, String> {
	

	@Query("SELECT s FROM Student s WHERE name=:name")
	public Student getStudentByName(@Param(value="name") String name);
	
	@Modifying
	@Query("Update Student set email=:email WHERE id=:id")
	public void updateStudentEmail(@Param(value="email") String email,@Param(value="id") String id);

//	@Query("Select s.name ,s.email ,d.depName  from Student s JOIN Deparment d  ON s.dep_fk=d.id")
//	public Iterable<Student> getJoinInformation();
	
	@Query("Select new com.example.first.dto.Response(s.name ,s.email ,d.depName)  FROM Student s JOIN Deparment d  ON s.dep_fk=d.id")
	public List<Response> getJoinInformation();
	

}
