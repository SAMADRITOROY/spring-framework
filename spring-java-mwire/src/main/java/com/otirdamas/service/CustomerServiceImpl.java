package com.otirdamas.service;

import java.util.List;

import com.otirdamas.model.Customer;
import com.otirdamas.repository.CustomerRepository;

public class CustomerServiceImpl implements CustomerService {


	private CustomerRepository customerRepository;

//	for constructor-injection
	public CustomerServiceImpl(CustomerRepository custRepo) {
		this.customerRepository = custRepo;
	}

	@Override
	public List<Customer> findAll() {
		return customerRepository.findAll();
	}
	
//	for setter-injection
//	public void setCustomerRepository(CustomerRepository customerRepository) {
//		this.customerRepository = customerRepository;
//	}

}
