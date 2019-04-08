package com.otirdamas.repository;

import java.util.List;

import com.otirdamas.model.Customer;

public interface CustomerRepository {

	public List<Customer> findAll();
	
}