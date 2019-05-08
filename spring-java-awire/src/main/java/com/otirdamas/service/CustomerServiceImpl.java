package com.otirdamas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.otirdamas.model.Customer;
import com.otirdamas.repository.CustomerRepository;

@Service("customerService")
public class CustomerServiceImpl implements CustomerService {

//	for member-injection
	@Autowired
	private CustomerRepository customerRepository;

//	for constructor-injection
//	@Autowired
//	public CustomerServiceImpl(CustomerRepository custRepo) {
//		this.customerRepository = custRepo;
//	}

	@Override
	public List<Customer> findAll() {
		return customerRepository.findAll();
	}
	
//	for setter-injection
//	@Autowired
//	public void setCustomerRepository(CustomerRepository customerRepository) {
//		this.customerRepository = customerRepository;
//	}

}
