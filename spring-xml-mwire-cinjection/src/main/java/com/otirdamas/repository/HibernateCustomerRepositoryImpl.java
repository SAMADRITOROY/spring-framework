package com.otirdamas.repository;

import java.util.ArrayList;
import java.util.List;

import com.otirdamas.model.Customer;

public class HibernateCustomerRepositoryImpl implements CustomerRepository {

	@Override
	public List<Customer> findAll() {
		
		Customer customer = new Customer();
		customer.setLastName("Roy");
		customer.setFirstName("Samadrito");
		
		List<Customer> customerList = new ArrayList<Customer>();
		customerList.add(customer);
		
		return customerList;
	}
}
