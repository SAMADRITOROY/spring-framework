package com.otirdamas.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.otirdamas.model.Customer;

@Component("customerRepository")
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
