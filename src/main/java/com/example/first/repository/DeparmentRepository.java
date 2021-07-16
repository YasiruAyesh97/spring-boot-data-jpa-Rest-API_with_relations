package com.example.first.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.first.model.Deparment;


@Repository
public interface DeparmentRepository extends CrudRepository<Deparment, Integer>{
	
}
