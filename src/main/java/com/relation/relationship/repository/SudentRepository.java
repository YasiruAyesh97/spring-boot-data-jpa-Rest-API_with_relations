package com.relation.relationship.repository;

import org.springframework.data.repository.CrudRepository;

import com.relation.relationship.model.Student;

public interface SudentRepository extends CrudRepository<Student, Integer> {

}
