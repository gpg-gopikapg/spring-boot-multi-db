package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.customer.Customer;
import com.example.demo.repository.customer.CustomerRepository;

@Service
public class CustomerImpl implements ICustomerService {

	@Autowired
	private CustomerRepository repo;

	@Override
	public Integer saveCustomer(Customer customer) {
		customer = repo.save(customer);
		return customer.getId();
	}

}
