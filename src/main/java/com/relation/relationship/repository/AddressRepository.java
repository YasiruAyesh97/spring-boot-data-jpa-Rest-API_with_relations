package com.relation.relationship.repository;

import org.springframework.data.repository.CrudRepository;

import com.relation.relationship.model.Address;

public interface AddressRepository extends CrudRepository<Address, Integer> {

}
