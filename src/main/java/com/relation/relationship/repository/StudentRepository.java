package com.relation.relationship.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.relation.relationship.model.Address;
import com.relation.relationship.model.Student;

@Repository
public interface StudentRepository extends CrudRepository<Student, Integer> {

	
	@Query("SELECT s From Student s where address.city = :city")
	public List<Student> getByAddressCity (String city);

	List<Student> findByAddressCity (String city);
	

}
