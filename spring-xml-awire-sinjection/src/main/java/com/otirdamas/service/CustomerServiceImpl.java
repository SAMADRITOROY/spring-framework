package com.otirdamas.service;

import java.util.List;

import com.otirdamas.model.Customer;
import com.otirdamas.repository.CustomerRepository;

public class CustomerServiceImpl implements CustomerService {
	
//	to display Autowiring using mode: 'byName'
	private CustomerRepository customerRepository;

	@Override
	public List<Customer> findAll() {
		return customerRepository.findAll();
	}

	public void setCustomerRepository(CustomerRepository custRepo) {
		this.customerRepository = custRepo;
	}

//	to display Autowiring using mode: 'byType' 
//	private CustomerRepository repo;
//
//	@Override
//	public List<Customer> findAll() {
//		return repo.findAll();
//	}
//
//	public void setRepo(CustomerRepository custRepo) {
//		this.repo = custRepo;
//	}

}
